package com.progressive.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.progressive.Pages.homePages;

public class validateRV {
	
	
	
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
	public void validateRVSignUpFlow() {
		
		hp.getRVOption().click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		hp.getZipCodeText().sendKeys("22031");
		hp.getsubmitButton().click();
		
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		String expectedTitle = "Progressive: Ranked One Of The Best Insurance Companies | Progressive ins";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	

}
