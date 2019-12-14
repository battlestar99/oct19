package com.agile1tech.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agile1tech.pages.homepageFacebook;

import junit.framework.Assert;
//import pages.homepageFacebook;

public class validateHomePage {
	
	WebDriver driver;
	 com.agile1tech.pages.homepageFacebook hf;
	
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 hf=new homepageFacebook(driver);
		
		Thread.sleep(2000);
		
		// will maximizing the window 
		
		driver.manage().window().maximize();
		
		// navigating to an url 
		
		//driver.get("https://www.facebook.com/");
		
		
		  driver.navigate().to("https://www.facebook.com/");
		 
		  Thread.sleep(2000);	
		
	}
	
	@Test
	public void validateTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		 
		  hf.getFirstName().sendKeys("Michael");
		  hf.getlastName().sendKeys("Jackson");
		  
		  boolean x = hf.getlastName().isDisplayed();
		
		Assert.assertTrue(x);
		
		//Assert.assertFalse(false);
		
		Assert.assertEquals("Facebook - Log In or Sign Up",title);
	}

	
	@AfterTest
	public void finishTest() {
		
		driver.quit();
		
		
		
		
		
	}
}
