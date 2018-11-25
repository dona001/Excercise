package PageObject.Excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class RegistraionPage {
	WebDriver driver;
	Fairy fairy = Fairy.create();
	
	By Register = By.className("btn btn-default");
	By title = By.name("title");
	By firstname = By.name("firstname");
	By surname = By.name("lastname");
	By phone = By.name("phone");
	By dob_year = By.name("year");
	By dob_month = By.name("month");
	By dob_date = By.name("date");
	By licencetype = By.name("licencetype");
	By licenceperiod = By.name("licenceperiod");
	By occupation = By.name("occupation");
	By address = By.name("street");
	By city = By.name("city");
	By county = By.name("county");
	By postcode = By.name("post_code");
	By email = By.name("email");
	By password = By.name("password");
	By confirm_password = By.name("c_password");
	By submit = By.name("submit");
	
	public RegistraionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewCustomer() {
		Person person = fairy.person();
		
		//driver.findElement(Register).click();
		driver.findElement(title).click();
		driver.findElement(firstname).sendKeys(person.getFirstName());
		driver.findElement(surname).sendKeys(person.getLastName());
		driver.findElement(phone).sendKeys("123456789");
		driver.findElement(dob_date).click();
		driver.findElement(dob_month).click();
		driver.findElement(dob_year).click();
		driver.findElement(licencetype).click();
		driver.findElement(licenceperiod).click();
		driver.findElement(occupation).click();
		driver.findElement(address).sendKeys(person.getAddress().toString());
		driver.findElement(city).sendKeys(person.getAddress().getCity().toString());
		driver.findElement(county).sendKeys("Srilanka");
		driver.findElement(postcode).sendKeys("222");
		driver.findElement(email).sendKeys(person.getEmail());
		driver.findElement(password).sendKeys("abc123@");
		driver.findElement(confirm_password).sendKeys("abc123@");
		driver.findElement(submit).click();
		
		
	}
	
	public void nagativenewcustomer(WebDriver driver) {
		
		driver.navigate().to("http://demo.guru99.com/insurance/v1/register.php");
		
	}
	
	
}
