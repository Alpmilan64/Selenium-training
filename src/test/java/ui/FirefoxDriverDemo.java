package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverDemo {

	public static void main(String[] args)  {
		
		
		
		           WebDriverManager.firefoxdriver().setup();
		           
		          WebDriver driver =  new  FirefoxDriver();
		           
		           //driver.get("http://www.google.com");
		          
		           driver.get("https://www.amazon.com");
		           
		          // Thread.sleep(5000);
		           driver.close();
		
		

	}

}
