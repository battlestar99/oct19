package testRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.homepageFacebook;
import pages.liteFacebookPage;

public class facebookSignUP {

	public static void main(String[] args) throws InterruptedException {
		
     // setting up and opening up browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		
		  driver.navigate().to("https://www.facebook.com/");
		 
		  Thread.sleep(2000);
		 
		  homepageFacebook hf=new homepageFacebook(driver);
		  
		  hf.getFirstName().sendKeys("Michael");
		  hf.getlastName().sendKeys("Jackson");
		  
		  liteFacebookPage lp=new liteFacebookPage(driver);
	
		
		
		
		
	}

}
