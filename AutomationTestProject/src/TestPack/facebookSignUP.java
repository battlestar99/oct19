package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookSignUP {

	public static void main(String[] args) throws InterruptedException {
		
     // setting up and opening up browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Selenium Testing libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(2000);
		
		// will maximizing the window 
		
		driver.manage().window().maximize();
		
		// navigating to an url 
		
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		// entering value in first name text box 
		
		// data type in selenium called web element 
		
		/*
		 * WebElement firstName = driver.findElement(By.id("u_0_f"));
		 * 
		 * firstName.sendKeys("Michael"); Thread.sleep(1000); firstName.clear();
		 * 
		 * // enting value for last name text box
		 * 
		 * WebElement lastName = driver.findElement(By.name("lastname"));
		 * lastName.sendKeys("Jackson");
		 */
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		WebElement facebookLitelink = driver.findElement(By.linkText("Facebook Lite"));
		
		String liteText = facebookLitelink.getText();
		
		System.out.println(liteText);
		
		
		facebookLitelink.click();
		
		String liteUrl = 	driver.getCurrentUrl();
		
		System.out.println(liteUrl );
		
		String liteTtitle = driver.getTitle();
		
		System.out.println(liteTtitle );
		
		
		
	}

}
