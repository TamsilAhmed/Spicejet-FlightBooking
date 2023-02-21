package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class FlightBookingRoundTrip extends Baseclass {
	
	@FindBy(xpath = "//input[@class=' form-control'] ")
	WebElement number;
	
	@FindBy(xpath = "//input[@id='email_id']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement login;	
	
	@FindBy(xpath = "//div[contains(@class,'btn btn-red plr-50')]")
	WebElement loginbutton;
	
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement number1;
	
	@FindBy(xpath = "//input[@data-testid='password-input-box-cta']")
	WebElement password1;
	
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement loginbutton1;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement roundway;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	
	@FindBy(xpath = "(//div[contains(@class,'css-1dbjc4n r-150rngu r-18u37iz r-16y2uox r-1wbh5a2')]/div/div//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[27]")
	WebElement Ddate;
	
	@FindBy(xpath = "(//div[contains(@class,'css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu')])[35]")
	WebElement Rdate;
	
	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	
	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement countinuesearch;
	
	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement passangercheckbox;
	
	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement travelcontinue;
	
	@FindBy(xpath = "(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement AddonContinue;
	
	@FindBy(xpath = "//input[@id='card_number']")
	WebElement cardnum;
	
	@FindBy(xpath = "//input[@id='name_on_card']")
	WebElement cardname;
	
	@FindBy(xpath = "//input[@id='card_exp_month']")
	WebElement cardmonth;
	
	@FindBy(xpath = "//input[@id='card_exp_year']")
	WebElement cardyear;
	
	@FindBy(xpath = "//input[@id='security_code']")
	WebElement cardcode;
	
	@FindBy(xpath = "//div[@data-testid='common-proceed-to-pay']")
	WebElement proceedpay;
	
	public FlightBookingRoundTrip() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String num,String pass) throws Exception {
	     Thread.sleep(2000);
		login.click();
		number1.sendKeys(num);
		password1.sendKeys(pass);
		loginbutton1.click();
		titlecheck();
		
	}
	public void flightbooking(String f,String t) throws Exception {
		roundway.click();
		from.sendKeys(f);
		Thread.sleep(1000);
		Fromdrobdown(from);
		Thread.sleep(1000);
		to.sendKeys(t);
		Todrobdown(to);
		Thread.sleep(1000);
		Ddate.click();
		Rdate.click();
		searchflight.click();
		Thread.sleep(5000);
		countinuesearch.click();
	}
	
	public void passengerdetails(String cityname) throws Exception {
		Thread.sleep(6000);
		city.sendKeys(cityname);
		passangercheckbox.click();
		travelcontinue.click();
		Thread.sleep(10000);
		AddonContinue.click();
		popup();
	}
	
	public void payment(String num,String name,String month,String year,String code) {
		cardnum.sendKeys(num);
		cardname.sendKeys(name);
		cardmonth.sendKeys(month);
		cardyear.sendKeys(year);
		cardcode.sendKeys(code);
		proceedpay.click();
		
	}

}
