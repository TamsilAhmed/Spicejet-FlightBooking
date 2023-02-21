package testcases;

import org.testng.annotations.Test;

import pages.FlightbookingOneWay;

public class Testcase2 extends FlightbookingOneWay {
	@Test

	public void test() throws Exception {
		FlightbookingOneWay fb = new FlightbookingOneWay();

		fb.login("7094188414", "Tamsil@123");
	
		fb.alerthandling();

		fb.alerthandling1();
		
		fb.homepage();

		fb.searchforflight("Chen", "Del");
		
		fb.Noflight();
		
		fb.passengerdetails("kadayanallur");
		
		fb.popupclose1();
		
		fb.popupclose2();
		
		Thread.sleep(8000);
		
		fb.payment("4792673202517890", "Emily Lang", "01", "28", "811");
		
		fb.paymentvalidation();
	}

}
