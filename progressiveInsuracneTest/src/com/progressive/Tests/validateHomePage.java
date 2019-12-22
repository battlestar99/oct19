package com.progressive.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.progressive.Pages.homePages;

public class validateHomePage {
	
	
	WebDriver driver; 
	homePages hp; 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		hp = new homePages(driver);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.progressive.com/");
		
		driver.manage().deleteAllCookies();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	@Test 
	public void validateURL() {
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.progressive.com/";
		Assert.assertEquals(actualURL, expectedURL);
		
		
	}
	
	@Test(dependsOnMethods="validateURL") 
	public void validateTitle() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Progressive: Ranked One Of The Best Insurance Companies | Progressive";
		
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
