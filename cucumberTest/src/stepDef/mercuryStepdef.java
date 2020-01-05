package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homepageFacebook;
import pages.mercuryPage;

public class mercuryStepdef {
	WebDriver driver;
	mercuryPage mp; 
	
	/*
	 * @Before public void beforetest() {
	 * 
	 * System.out.print("executing before a feature");
	 * 
	 * }
	 * 
	 * @After public void aftrertest() {
	 * 
	 * driver.quit();
	 * 
	 * }
	 */
	
	@Given("^user is on the mercury sign up page$")
	public void user_is_on_the_mercury_sign_up_page() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 mp=new mercuryPage(driver);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		 
		  Thread.sleep(2000);	
	  
	}

	@When("^user enters postive first name \"([^\"]*)\" for positive data$")
	public void user_enters_postive_first_name_for_positive_data(String firstname)  {
	    
		mp.getFirstName().sendKeys(firstname);
	}

	@When("^user enters last name  mercury sign up page \"([^\"]*)\" for positive data$")
	public void user_enters_last_name_mercury_sign_up_page_for_positive_data(String lastname)  {
	    mp.getlastnameName().sendKeys(lastname);
	}

	@When("^user enters phone number \"([^\"]*)\" for positive data$")
	public void user_enters_phone_number_for_positive_data(String arg1)  {
	    
	}

	@When("^user enters email \"([^\"]*)\" for positive data$")
	public void user_enters_email_for_positive_data(String arg1)  {
	    
	}

	@When("^user enters first name mercury sign up page \"([^\"]*)\" for negative data$")
	public void user_enters_first_name_mercury_sign_up_page_for_negative_data(String firstname)  {
	  mp.getFirstName().sendKeys(firstname);
	}

	@When("^user enters last name  mercury sign up page \"([^\"]*)\" for negative data$")
	public void user_enters_last_name_mercury_sign_up_page_for_negative_data(String lastName)  {
	   mp.getlastnameName().sendKeys(lastName);
	}

	@When("^user enters phone number \"([^\"]*)\" for negative data$")
	public void user_enters_phone_number_for_negative_data(String arg1)  {
	    
	}

	@When("^user enters email \"([^\"]*)\" for negative data$")
	public void user_enters_email_for_negative_data(String arg1)  {
	 
	}
	
	@When("^user enters first name with \"([^\"]*)\"$")
	public void user_enters_first_name_with(String arg1)  {
	  mp.getFirstName().sendKeys(arg1);
	}

	@When("^user enters last name with \"([^\"]*)\"$")
	public void user_enters_last_name_with(String arg1) {
	    mp.getlastnameName().sendKeys(arg1);
	   
	}

	@Then("^user should be able to create an account$")
	public void user_should_be_able_to_create_an_account()  {
	   
	}

	@Then("^user can close the browser$")
	public void user_can_close_the_browser() throws InterruptedException  {
	   Thread.sleep(1000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
