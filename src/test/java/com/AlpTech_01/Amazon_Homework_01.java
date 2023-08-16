package com.AlpTech_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Homework_01 {
	
	
	    // HW1: Amazon Page Title Verification:
		// Open chrome browser
		// Go to “https://www.amazon.com/”
		// Verify Title “Amazon.com: Online Shopping for Electronics, Apparel,
		// Computers, Books, DVDs & more” is displayed
		// End the Session (close the browser).

		public static void main(String[] args) {

			//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver(); // up-casting

			driver.get("https://www.amazon.com/");

			String expectedTitle = "Amazon.com. Spend less. Smile more.";

			String actualTitle = driver.getTitle();

			System.out.println("Expected title -> " + expectedTitle);
			System.out.println("Actual title -> " + actualTitle);

			if (expectedTitle.equalsIgnoreCase(actualTitle)) {
				System.out.println("Test passed!");
			} else {
				System.out.println("Test failed!");
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.quit();

		}

	

}
