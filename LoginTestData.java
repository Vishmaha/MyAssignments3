package week3_Assignment;

public class LoginTestData extends TestData {
	
	public void enterUsername(String name1) {
 System.out.println(name1);
	}
	
	public void enterPassword(String credentials) {
		System.out.println(credentials);

	}
	
	public static void main (String[] args) {
		LoginTestData l = new LoginTestData();
		l.enterUsername("Vishali");
		l.enterPassword("abc@123");
		l.enterCredentials("rtr@34");
		l.navigateToHomePage("Navigated back to home page");
		
	}
	
}
