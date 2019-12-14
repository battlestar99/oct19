package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepageFacebook {
	
	WebDriver driver ; 
	
	
	public homepageFacebook(WebDriver x ) {
		
	driver=x;
		
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
	
	public WebElement getmonthdropdown() {
		
		 WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		return month;
		
	}
	
	
	

}
