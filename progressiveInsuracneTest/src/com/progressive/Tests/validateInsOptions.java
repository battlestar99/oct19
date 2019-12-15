package com.progressive.Tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.progressive.Pages.homePages;



public class validateInsOptions {
	
	
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
	
	@Test(priority=1)
	public void validateInsuranceOptionsAuto() {
		
		
	
		
	boolean autopresent= hp.getAutoOption().isDisplayed();
	boolean autoEnabled=hp.getAutoOption().isEnabled();
	String ActualAutoText = hp.getAutoOption().getText();
	String expectedText = "Auto";
	
	Assert.assertTrue(autopresent);
	Assert.assertTrue(autoEnabled);
	Assert.assertEquals(ActualAutoText, expectedText);
		
			
		
	}
	
	@Test(priority=2)
	
	public void validateInsuranceOptionsHome() {
		
		
	boolean homepresent= hp.getHomeOption().isDisplayed();
	String actualHomeText = hp.getHomeOption().getText();
	String expectedHomewText = "Home";
	
	Assert.assertTrue(homepresent);
	Assert.assertEquals(actualHomeText, expectedHomewText);
		
			
		
	}
	
	
	
	
	
	
	
	

}
