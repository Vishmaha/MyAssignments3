package week3_Assignment;

public class TestData {

	public void enterCredentials(String pwd) {

		System.out.println(pwd);
	}

	public void navigateToHomePage(String click) {
		System.out.println(click);
	}
	
	public static void main (String[] args) {
		TestData td = new TestData();
		td.enterCredentials("abc@123");
		td.navigateToHomePage("Navigated back to home page");
	}

}
