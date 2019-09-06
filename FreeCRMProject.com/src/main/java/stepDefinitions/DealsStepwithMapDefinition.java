package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DealsStepwithMapDefinition {
		WebDriver driver;
		
		@Given("^user is already on login page$")
		public void user_already_login_page(){
			System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.freecrm.com");
			
		}
		
		@When("^title of login page is Free CRM$")
		public void title_of_login_page_is_Free_CRM()  {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Free CRM software in the cloud for sales and service", title);
		}

		@Then("^user enters username and password$")
		public void user_enters_username_and_password(DataTable credentials) {
			for(Map<String,String>  data : credentials.asMaps(String.class, String.class))//gives the list of list of strings
			{
			driver.findElement(By.xpath("//span[text()='Log In']")).click();
			   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get("username"));
			   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
		    
		}
}
		

		@Then("^usser clicks on login button$")
		public void user_clicks_on_login_button() {
			driver.findElement(By.xpath("//div[text()='Login']")).click();
		}


		@Then("^user is on home page$")
		public void user_is_on_home_page() {
			String title1 = driver.getTitle();
			System.out.println(title1);
			Assert.assertEquals("CRM", title1);
			
		}

		@Then("^user moves to new deal page$")
		public void user_moves_to_new_deal_page() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a//span[text()='Deals']")).click();
			driver.findElement(By.xpath("//button[text()='New']")).click();
		}

		@Then("^user enters deal details$")
		public void user_enters_deal_details(DataTable dealdata){
			for(Map<String,String> data1: dealdata.asMaps(String.class, String.class))
			{
			driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data1.get("title"));
			driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(data1.get("probability"));
			driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(data1.get("commission"));
			driver.findElement(By.xpath("//button[text()='Save']")).click();
		}
		}
		
		
		@Then("^Close the browser$")
		public void close_the_browser(){
			driver.close();
			
		}

	}



