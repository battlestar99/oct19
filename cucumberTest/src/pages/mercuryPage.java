package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercuryPage {
	
	
WebDriver driver ; 
	
	
	public mercuryPage(WebDriver x ) {
		
	driver=x;
		
	}
	
	
	
	
	public WebElement getlastnameName() {
		
		 WebElement lastname = driver.findElement(By.name("lastName"));
		
		return lastname;
		
	}

	
	public WebElement getFirstName() {
		
		 WebElement firstName = driver.findElement(By.name("firstName"));
		
		return firstName;
		
	}
}
