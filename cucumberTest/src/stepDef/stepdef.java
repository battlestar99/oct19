package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdef {
	
	WebDriver driver;
	
	@Given("^user is on the signup page$")
	public void user_is_on_the_signup_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		  driver.navigate().to("https://www.facebook.com/");
		 
		  Thread.sleep(2000);	
	   
	}

	@When("^user enters username$")
	public void user_enters_username()  {
driver.findElement(By.linkText("Sign Up")).click();
		
		String expectedTitle="Facebook - Log In or Sign Up";
		String expectedURL="https://www.facebook.com/r.php";
		
		String actualTitle = driver.getTitle();
		String presentUrl = driver.getCurrentUrl();
		
		
		
		Assert.assertEquals("expectedTitle",actualTitle);
		Assert.assertEquals("expectedURL",presentUrl);
	}

	@When("^user enters new password$")
	public void user_enters_new_password()  {
	   
	}

	@When("^user enters first name$")
	public void user_enters_first_name()  {
	    
	}

	@When("^user enters last name$")
	public void user_enters_last_name()  {
	  
	}

	@When("^user clicks on the signup button$")
	public void user_clicks_on_the_signup_button()  {
	   
	}

	@Then("^new account for the user should be created$")
	public void new_account_for_the_user_should_be_created()  {
	    
	}

	@Then("^user should navigate to the new account page$")
	public void user_should_navigate_to_the_new_account_page()  {
	   
	}

	@Given("^user is on the home page$")
	public void user_is_on_the_home_page()  {
	   
	}

	@When("^user clicks on the login link$")
	public void user_clicks_on_the_login_link() {
	    
	}

	@Then("^user should navigate to the login page$")
	public void user_should_navigate_to_the_login_page()  {
	    
	}

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page()  {
	    
	}

	@When("^user enters righ username$")
	public void user_enters_righ_username() {
	    
	}

	@When("^user enters right password$")
	public void user_enters_right_password()  {
	    
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() {
	   
	}

	@Then("^user should be in the login home page$")
	public void user_should_be_in_the_login_home_page()  {
	    
	}



	
	

}
