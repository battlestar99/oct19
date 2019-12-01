package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTest {

	public static void main(String[] args) throws InterruptedException {
		
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.facebook.com/");
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			WebElement linkpeople = driver.findElement(By.linkText("People"));
			
			String linkText = linkpeople.getText();
			System.out.println(linkText);
			
			linkpeople.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			driver.navigate().forward();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			
			
	}

}
