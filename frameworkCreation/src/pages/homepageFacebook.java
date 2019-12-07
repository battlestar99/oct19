package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageFacebook {
	
	WebDriver driver ; 
	
	public homepageFacebook(WebDriver tdriver) {
		
		driver =tdriver; 
		
		
	}
	
	
	
	
	
	public WebElement getFirstName() {
		
		 WebElement firstName = driver.findElement(By.id("u_0_f"));	
		return firstName;
		
	}
	
	public WebElement getlastName() {
		
		 WebElement lastName = driver.findElement(By.name("lastname"));
		return lastName;
		
	}
	
	public WebElement getuserName() {
		
		 WebElement username = driver.findElement(By.name("username"));
		return username;
		
	}
	
	
	
	
	

}
