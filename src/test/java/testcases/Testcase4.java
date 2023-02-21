package testcases;

import org.testng.annotations.Test;

import pages.Validation;

public class Testcase4 extends Validation{
	@Test
	public void test() throws Exception {
		
		Validation vn = new Validation();
		
		vn.login("7094188414", "Tamsil@123");
		
		vn.alerthandling();
		
		vn.alerthandling1();
		
		vn.valid();
		
	}

}
