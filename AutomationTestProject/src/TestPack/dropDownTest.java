package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		// will maximizing the window 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select ddmonth = new Select (month);
		
		ddmonth.selectByIndex(0);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select ddyear = new Select (year);
		
		ddyear.selectByIndex(15);
		
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
