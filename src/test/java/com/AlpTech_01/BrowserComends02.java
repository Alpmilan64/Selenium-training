package com.AlpTech_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserComends02 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		// 1st way
		// driver.get("https://www.facebook.com/");
		// will NOT store the history
		// wait for the page elements to be loaded

		// 2nd way
		driver.navigate().to("https://www.facebook.com/");
		// saves the history
		// does NOT wait the page to be fully loaded

		Thread.sleep(1000);

		driver.manage().window().maximize(); // --> makes full screen
		// driver.manage().window().fullscreen(); // --> makes full screen
		Thread.sleep(1000);

	    driver.navigate().refresh(); // reload the page
		Thread.sleep(1000);

		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(1000);

		driver.navigate().back(); // brings us back to facebook
		Thread.sleep(1000);

		driver.navigate().forward(); // brings us forward to amazon
	     Thread.sleep(2000);

		driver.quit(); // closing and destroying the browser
		// driver.close(); // After quiting I cannot do anything
	}

	

}
