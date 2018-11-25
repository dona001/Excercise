package Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import ExtentReport.ExtentReport;
import PageObject.Excercise.HomePage;
import PageObject.Excercise.RegistraionPage;

public class Test {
	WebDriver driver;
	
	RegistraionPage objRegistraionPage;
	HomePage obHomePage;
	
	 ExtentReport extRpt = new ExtentReport();
	 Logger log = Logger.getLogger("devpinoyLogger");
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.chrome.driver","D:\\se\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://demo.guru99.com/insurance/v1");
		
	}
	 
	 @org.testng.annotations.Test(priority=0)
	 public void createcustomer() {
			objRegistraionPage = new RegistraionPage(driver);
			
			//Navigation  start test case
			extRpt.startTestCase("Navigation");
			
			objRegistraionPage.nagativenewcustomer(driver);
			objRegistraionPage.createNewCustomer();
			
			 //Navigation Test case pass or fail
		    extRpt.logEventsPass("Created ");
		    driver.close();
	    	extRpt.createFinalReport();
			
		}

}
