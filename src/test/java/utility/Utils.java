package utility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utils {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public void switchtab() {
		String parent = driver.getWindowHandle();
		
		Set<String>windows = driver.getWindowHandles();
		
		for(String address:windows) {
			if(!address.contentEquals(parent)) {
				driver.switchTo().window(address);
				break;
				
			}
			
		}
	}
	
	public void titlecheck() {
		extent = new ExtentReports("Reports.html", true);

		test = extent.startTest("Google Search", "Title Validation");
		try {
	      String title = driver.getTitle();
	      
	      test.log(LogStatus.INFO, "Getting Page Title");
	      
	      if (title.equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets")) {
				
				test.log(LogStatus.FAIL, "Title is not Shown");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Error.png"));
				String img = test.addScreenCapture("./screenshot/Error.png");
			} else {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Welcome.png"));
				String img = test.addScreenCapture("./screenshot/Welcome.png");
				test.log(LogStatus.PASS, "Title is Shown");
				
			}
	}catch(Exception e) {
		test.log(LogStatus.ERROR, "Title Shown Problem");
	}
		extent.endTest(test);

		extent.flush();

}
	
	public void titledropdown(WebElement element) {
		extent = new ExtentReports("Reports.html", true);

		test = extent.startTest("Dropdown Checking", "Value Validation");
		try {
		Select select = new Select(element);
		select.selectByVisibleText("Mr");
		test.log(LogStatus.INFO, "Clicking Value");
		
	}catch(Exception e) {
		e.getMessage();
	}
		extent.endTest(test);

		extent.flush();
	
}
	public void countrydropdown(WebElement element) {
		extent = new ExtentReports("Reports.html", true);

		test = extent.startTest("Dropdown Checking", "Value Validation");
		try {
		Select select = new Select(element);
		select.selectByVisibleText("India");
		test.log(LogStatus.INFO, "Clicking Value");
		
	}catch(Exception e) {
		test.log(LogStatus.ERROR, e.getMessage());
	}
		extent.endTest(test);

		extent.flush();
}
	
	public void alerthandling() {
		extent = new ExtentReports("Reports.html", true);

		test = extent.startTest("Alert handling", "Alert Validation");
		try {
			String projectpath = System.getProperty("user.dir");
			Screen sc = new Screen();
			Pattern pa = new Pattern(projectpath + "\\skuli_images\\1676722033168.png");
			sc.click(pa);
			test.log(LogStatus.INFO, "Alert canceled");
		}catch(Exception e) {
			test.log(LogStatus.ERROR, e.getMessage());
		}
		extent.endTest(test);

		extent.flush();
	}
	public void waitforme(WebElement element) {
	
		    WebDriverWait wait = new WebDriverWait(driver, 5);
		    wait.until(ExpectedConditions.elementToBeClickable(element));

		    driver.manage().logs();
	}
	
	public void account() {
		extent = new ExtentReports("Reports.html", true);

		test = extent.startTest("Email account Creation", "Email Verification");
		try {
			String projectpath = System.getProperty("user.dir");
			Screen sc = new Screen();
			Pattern pa = new Pattern(projectpath + "\\skuli_images\\1676725776887.png");
			sc.type("thamsil43@gmail.com");
			
			pa = new Pattern(projectpath + "\\skuli_images\\1676725195521.png");
			sc.type("Tamsil@123");
			
			pa = new Pattern(projectpath + "\\skuli_images\\1676725794131.png");
			sc.type("Tamsil@123");
			
		}catch(Exception e) {
			test.log(LogStatus.ERROR, e.getMessage());
		}
		extent.endTest(test);

		extent.flush();
	}
		public void action(WebElement element) {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		}
		
		public void scrolldown1() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");
		}
		public void scrolldown2() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
		}
		public void alerthandling1() {
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Alert handling", "Alert Validation");
			try {
				String projectpath = System.getProperty("user.dir");
				Screen sc = new Screen();
				Pattern pa = new Pattern(projectpath + "\\skuli_images\\1676722033168.png");
				sc.click(pa);
				test.log(LogStatus.INFO, "Alert canceled");
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
			}
			extent.endTest(test);

			extent.flush();
		}
		public void homepage() {
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Account signIn with Email", "Account Successfully open");
			try {
			String welcome = driver.findElement(By.xpath("//div[contains(@class,'css-76zvg2 r-jwli3a r-ubezar')]")).getText();
			
			if (welcome.contentEquals("Hi Tamsil")) {
				
				test.log(LogStatus.FAIL, "Message shown");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Error.png"));
				String img = test.addScreenCapture("./screenshot/Error.png");
			} else {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Welcome.png"));
				String img = test.addScreenCapture("./screenshot/Welcome.png");
				test.log(LogStatus.PASS, "Account Singin and Welcome Message Shown");
				
			}
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
			}

			extent.endTest(test);

			extent.flush();
		}
		public void Fromdrobdown(WebElement element) {
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Dropdown Checking", "Value Validation");
			try {
			Select select = new Select(element);
			select.selectByVisibleText("Chennai");
			test.log(LogStatus.INFO, "Clicking Value");
			
		}catch(Exception e) {
			test.log(LogStatus.ERROR, e.getMessage());
		}
			extent.endTest(test);

			extent.flush();
	}
		public void Todrobdown(WebElement element) {
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Dropdown Checking", "Value Validation");
			try {
			Select select = new Select(element);
			select.selectByVisibleText("Delhi");
			test.log(LogStatus.INFO, "Clicking Value");
			
		}catch(Exception e) {
			test.log(LogStatus.ERROR, e.getMessage());
		}
			extent.endTest(test);

			extent.flush();
	}
		public void popup() {
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Alert popup Handling", "Alert Validation");
			try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			test.log(LogStatus.PASS, "Alert closed");
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
			}
			extent.endTest(test);

			extent.flush();
		}
		
		public void Noflight() {
			
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Alert popup Handling", "Alert Validation");
			try {
			
			String noflighterror = driver.findElement(By.xpath("//div[contains(text(),'Unfortunately, there are no flights available.')]")).getText();
			test.log(LogStatus.INFO, "Getting Message");
			
			if(noflighterror.equals("Unfortunately, there are no flights available")) {
				test.log(LogStatus.FAIL, "There is no flight");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/NoFlight.png"));
				String img = test.addScreenCapture("./screenshot/NoFlight.png");
				
			}else {
				test.log(LogStatus.PASS, "The Flights are shown");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Flightshown.png"));
				String img = test.addScreenCapture("./screenshot/Flightshown.png");
			}
			
			
			
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
				
			}
			extent.endTest(test);

			extent.flush();
		}
		public void elementavailable(WebElement element) throws Exception {
			
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Title Check", "Visibility Check");
			
			test.log(LogStatus.INFO, "Checking for the Title");
			
			driver.getTitle();
			
			if(driver.getTitle()!=null) {
			
			test.log(LogStatus.PASS, "The Title is Shown");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/Title.png"));
			String img = test.addScreenCapture("./screenshot/Title.png");
			}
			
			else {
			test.log(LogStatus.FAIL, "The Title is not Shown"); 
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/TitleNotShown.png"));
			String img = test.addScreenCapture("./screenshot/TitleNotShown.png");
		}
			extent.endTest(test);

			extent.flush();
			
		}
		public void paymentvalidation() throws Exception {
			
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Payment For the Flight Booking", "Confirmation");
			try {
			String error = driver.findElement(By.xpath("//div[contains(text(),'Payment Failure')]")).getText();
			
			test.log(LogStatus.INFO, "Getting Message");
			
			if(error.equals("Payment Failure")) {
				test.log(LogStatus.FAIL, "payment failed");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/paymentFailed.png"));
				String img = test.addScreenCapture("./screenshot/paymentFailed.png");
			}else {
				test.log(LogStatus.PASS, "Payment confirmed");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/paymentconfirm.png"));
				String img = test.addScreenCapture("./screenshot/paymentconfirm.png");
			}
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
				
			}
			extent.endTest(test);

			extent.flush();
			
			
		}
		public void quit() {
			driver.quit();
		}
		public void popupclose1() {
			
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Alert handling", "Alert Validation");
			try {
				String projectpath = System.getProperty("user.dir");
				Screen sc = new Screen();
				Pattern pa = new Pattern(projectpath + "\\skuli_images\\1676954593655.png");
				sc.click(pa);
				test.log(LogStatus.INFO, "Alert canceled");
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
			}
			extent.endTest(test);

			extent.flush();
		}
		
public void popupclose2() {
			
			extent = new ExtentReports("Reports.html", true);

			test = extent.startTest("Alert handling", "Alert Validation");
			try {
				String projectpath = System.getProperty("user.dir");
				Screen sc = new Screen();
				Pattern pa = new Pattern(projectpath + "\\skuli_images\\1676954629084.png");
				sc.click(pa);
				test.log(LogStatus.INFO, "Alert canceled");
			}catch(Exception e) {
				test.log(LogStatus.ERROR, e.getMessage());
			}
			extent.endTest(test);

			extent.flush();
		}
			
		}
		
	
	

