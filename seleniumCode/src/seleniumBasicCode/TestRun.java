package seleniumBasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

	public static void main(String[] args) throws InterruptedException {
		
		// setting up and opening up browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// navigate to an url 
	
		driver.get("https://www.facebook.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Michael");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Jackson");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("7685678765");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("fhfdljk++");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
