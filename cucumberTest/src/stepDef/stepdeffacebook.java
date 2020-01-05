package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.homepageFacebook;

public class stepdeffacebook {
	WebDriver driver;
	homepageFacebook hpf; 
	
	@Given("^user is on the facebook home page$")
	public void user_is_on_the_facebook_home_page() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 hpf = new homepageFacebook(driver);
		 
		 
		 
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		 
		  Thread.sleep(2000);	
		
	}

	@When("^user enters first Name$")
	public void user_enters_first_Name()  {
		
		hpf.getFirstName().sendKeys("Michael");
	   
	}

	@When("^user enters last name for signup$")
	public void user_enters_last_name_for_signup() throws Throwable {
		
		hpf.getlastName().sendKeys("jordan");
	}

	@When("^user enters email address$")
	public void user_enters_email_address() throws Throwable {
		hpf.getemailphone().sendKeys("michael@gmail.com");
	}

	@When("^user enters new password for signup$")
	public void user_enters_new_password_for_signup()  {
	   
	}

	@When("^user select birhtday month$")
	public void user_select_birhtday_month() {
	  
	}

	@When("^user select birth date$")
	public void user_select_birth_date() throws Throwable {
	  
	}

	@When("^user select birth year$")
	public void user_select_birth_year() {
	    
	}

	@When("^use clicks on the sign up button$")
	public void use_clicks_on_the_sign_up_button()  {
	   
	}

	@Then("^user should have a new account$")
	public void user_should_have_a_new_account(){
	   
	}

	@Then("^user should be in the new account home page$")
	public void user_should_be_in_the_new_account_home_page()  {
	   
	}
	
	
	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name()  {
	  
		hpf.getFirstName().sendKeys("56788");
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	  hpf.getlastName().sendKeys("224");
	}

	@Then("^user should not be able to create a login$")
	public void user_should_not_be_able_to_create_a_login()  {
	   
	}

	@Then("^close the browser$")
	public void close_the_browser()  {
	   
		driver.quit();
	}

}
