package seleniumBasicCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumRun {

	public static void main(String[] args) {
		
		
		// setting up the browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
	//	System.setProperty("webdriver.ie.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\IEDriverServer.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1=new ChromeDriver();
		//WebDriver driver2=new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com");
		driver1.get("https://www.google.com");
		//driver2.get("https://www.google.com");
		
		
		
		//driver.quit();
		
		
		

	}

}
