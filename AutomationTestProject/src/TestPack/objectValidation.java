package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectValidation {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// implicit wait 
		
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	WebElement loginButton = driver.findElement(By.id("u_0_4"));
		WebElement signupButton = driver.findElement(By.id("u_0_w"));
		
	//	boolean loginButtonPresent = loginButton.isDisplayed();
		boolean signupButtonPresent = signupButton.isDisplayed();
		
		
		
		
	//	System.out.println(loginButtonPresent);
		System.out.println("Checking if the button is displayed ....");
		System.out.println(signupButtonPresent);
		System.out.println("Checking if the button is enabled ....");
		System.out.println(signupButton.isEnabled());
  
	}

}
