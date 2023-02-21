package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class SignUpPage extends Baseclass{
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signup;
	
	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement title;

	@FindBy(xpath = "//input[@id='first_name'] ")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name'] ")
	WebElement lastname;
	
	@FindBy(xpath = "//select[@class='form-control form-select'] ")
	WebElement country;
	
	@FindBy(xpath = "//input[@id='dobDate'] ")
	WebElement DOB;
	
	@FindBy(xpath = "//input[@class=' form-control'] ")
	WebElement number;
	
	@FindBy(xpath = "//input[@id='email_id']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='c-password']")
	WebElement cpassword;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]")
	WebElement DOBclick;
	
	@FindBy(xpath = "//input[@id='defaultCheck1']")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[@class='btn btn-red']")
	WebElement signupbutton;
	
	
public SignUpPage() {
	PageFactory.initElements(driver, this);
}


public void signup(String fname,String lname, String dob,String num,String mail) throws Exception {
		
		signup.click();
		switchtab();
		titledropdown(title);
		firstname.sendKeys(fname);
		Thread.sleep(1000);
		lastname.sendKeys(lname);
		countrydropdown(country);
		DOB.sendKeys(dob);
		DOBclick.click();
		number.sendKeys(num);
		Thread.sleep(1000);
		Email.sendKeys(mail);
	}

public void Mail(String mail) throws Exception {
	Thread.sleep(1000);
	
	Email.sendKeys(mail);
	
}
public void Password(String pass) throws Exception {
	
    password.sendKeys(pass);
    
    password.sendKeys(pass);
	
	cpassword.sendKeys(pass);
	
	
	
}
public void clicksignup() throws Exception {
	
	Thread.sleep(500);
	scrolldown1();
	Thread.sleep(2000);
	checkbox.click();
	Thread.sleep(1000);
	signupbutton.click();
	
}
}

