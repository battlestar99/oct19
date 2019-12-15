package com.progressive.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePages {
	
	WebDriver driver;
	
	public homePages(WebDriver x) {
		
		driver=x;
		
	}
	
	
	
  public WebElement getAutoOption() {
		
		WebElement auto  = 	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[2]/div[1]/ul/li[1]/a/p"));
		return auto; 
	}
	
public WebElement getHomeOption() {
		
	WebElement home  = 	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[2]/div[1]/ul/li[2]/a/p"));
		return home; 
	}

public WebElement getRVOption() {
	
	WebElement RV  = 	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[2]/div[1]/ul/li[3]/a/p"));
	return RV; 
	}


public WebElement getZipCodeText() {
	
	WebElement zipcode  = 	driver.findElement(By.name("ZipCode"));
	return zipcode; 
	}


public WebElement getsubmitButton() {
	
	WebElement submitButton  = 	driver.findElement(By.name("qsButton"));
	return submitButton; 
	}
	
	
	
	
	
	
	
	

}
