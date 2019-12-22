package com.progressive.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.progressive.Pages.homePages;

public class mercuryLogin {
	
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void setupTest(String browswer) throws InterruptedException {
		
		if(browswer=="mozila") {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		}
		if(browswer=="chrome") {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
			
			driver = new ChromeDriver();
			}
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.manage().deleteAllCookies();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}
	
	
	@Parameters({"username","password","expecteddata"})
	@Test
	public void loginTest(String usernamedata, String passworddata, String expecteddata) {
		
		WebElement username = driver.findElement(By.name("userName")); 
		
		WebElement password = driver.findElement(By.name("password")); 
		
		// hardcoding our data 
		username.sendKeys(usernamedata);
		password.sendKeys(passworddata);
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expecteddata);
		
	}
	
	@AfterTest
	public void aftertest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
