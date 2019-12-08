package testRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		x.sendKeys("selenium");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
