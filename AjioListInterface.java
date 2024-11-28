package week3_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioListInterface {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags" + Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title: "+ title);
		
		WebElement men = driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(men));
		
		men.click();
		
		WebElement fashionBags = driver.findElement(By.xpath("//span[text()='category']/following::label[contains(text(),'Fashion Bags')]"));
		wait.until(ExpectedConditions.elementToBeClickable(fashionBags));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", fashionBags);
		
		WebElement items = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println("count: "+ items.getText());
		
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		js.executeScript("window.scrollBy(0,250)","");
		
		WebElement more = driver.findElement(By.xpath("//span[text()='brands']/following::strong[text()='MORE']"));
		more.click();
		
		List<WebElement> brands = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		System.out.println("======Brands Name======");
		for(int i=0; i<brands.size(); i++) {
			String text = brands.get(i).getText();
			System.out.println(text);
		}
		driver.findElement(By.id("closeBtn")).click();
		
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("======Bags Name======");
		for(int i=0; i<bagNames.size(); i++) {
			String text = bagNames.get(i).getText();
			System.out.println(text);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
