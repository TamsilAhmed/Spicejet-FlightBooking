package testcases;

import org.testng.annotations.Test;

import pages.FlightBookingRoundTrip;

public class Testcase3 extends FlightBookingRoundTrip{
	
	@Test
	
	public void test() throws Exception {
		
		FlightBookingRoundTrip fr = new FlightBookingRoundTrip();
		
		fr.login("7094188414", "Tamsil@123");
		
		
		fr.alerthandling();

		fr.alerthandling1();
		
		Thread.sleep(1000);
		
		fr.homepage();
		
		fr.flightbooking("Chen", "Del");
		
		fr.Noflight();
		
		fr.passengerdetails("Kadayanallur");
		
		fr.popupclose1();
		
		fr.popupclose2();
		
		Thread.sleep(8000);
		
		fr.payment("4792673202517890", "Emily Lang", "01", "28", "811");
		
		fr.paymentvalidation();
		
	}

}
