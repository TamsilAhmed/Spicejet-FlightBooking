package testcases;

import org.testng.annotations.Test;

import pages.SignUpPage;

public class Testcase1 extends SignUpPage{
	
	@Test
	
	public void test() throws Exception {
	
		SignUpPage sp = new SignUpPage();
	
	 sp.signup("Tamsil", "Ahmed", "06/19/1999","7094188414","thamsil43@gmail.com");
	 
	 Thread.sleep(2000);

		sp.Mail("thamsil43@gmail.com");
		
		sp.alerthandling();

		sp.alerthandling1();
		
		Thread.sleep(1000);
			
			sp.Password("Tamsil@123");
	
			sp.clicksignup();
			
			sp.quit();

}
}