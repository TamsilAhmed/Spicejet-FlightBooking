package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Validation extends Baseclass {
	
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
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[1]")
	WebElement checkin;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[2]")
	WebElement status;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[3]")
	WebElement manage;
	
	public Validation() {
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
	
	public void valid() throws Exception {
		
		checkin.click();
		elementavailable(checkin);
		Thread.sleep(1000);
		status.click();
		elementavailable(status);
		Thread.sleep(1000);
		manage.click();
		elementavailable(manage);
		Thread.sleep(1000);
		
	}

}
