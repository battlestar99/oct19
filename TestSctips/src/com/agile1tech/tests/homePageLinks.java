package com.agile1tech.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agile1tech.pages.homepageFacebook;

import junit.framework.Assert;

public class homePageLinks {
	
	WebDriver driver;
	
	
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		  driver.navigate().to("https://www.facebook.com/");
		 
		  Thread.sleep(2000);	
		
	}
	
	@Test(enabled=false) 
	public void validateSignupURL() {
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		String expectedTitle="Facebook - Log In or Sign Up";
		String expectedURL="https://www.facebook.com/r.php";
		
		String actualTitle = driver.getTitle();
		String presentUrl = driver.getCurrentUrl();
		
		
		
		Assert.assertEquals("expectedTitle",actualTitle);
		Assert.assertEquals("expectedURL",presentUrl);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
