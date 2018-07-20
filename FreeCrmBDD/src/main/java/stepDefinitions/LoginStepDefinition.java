package stepDefinitions;

import org.apache.http.impl.io.SocketOutputBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already in login page$")  //copy the string from .feature and paste, on start ^, on end $
	public void user_already_on_login_page(){
		//this is a precondition
		System.setProperty("webdriver.chrome.driver","C:\\AutomationDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}
	
	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm(){
	String title=driver.getTitle();	
	Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);
	}
	
	@Then("^user enters user and user enters password$")
	public void user_enters_user_and_user_enters_password(){
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argumnet[0].click();",loginBtn);	
		loginBtn.click();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title=driver.getTitle();
		System.out.println("Home page title ::" + title);
		Assert.assertEquals("CRMPRO",title);

	}
	
}
