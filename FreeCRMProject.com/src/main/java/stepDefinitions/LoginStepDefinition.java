package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
 @Given("^user is already on login page$")
	public void user_already_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		
	}
	
	@When("^title of login page is free CRM$")
	public void title_login_page_free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud for sales and service", title);
	}
	
	@Then("^user enteres \"(.*)\" and \"(.*)\"$")
	public void user_enteres_username_and_password(String username, String password)  {
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		   
	}


	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}


}
