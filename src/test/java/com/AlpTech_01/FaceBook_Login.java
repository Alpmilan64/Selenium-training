package com.AlpTech_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook_Login {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver.get("https://www.facebook.com/");

		// typing the email into the username textbox
		driver.findElement(By.id("email")).sendKeys("ferdi@gmail.com");
		Thread.sleep(1000);

		// typing the password
		driver.findElement(By.name("pass")).sendKeys("Turkmen$123");
		Thread.sleep(2000);

		// It didn't work because the id is NOT correct
		// driver.findElement(By.id("u_0_9_vw")).click();

		// Click on Link -> Forgot password?
		
	     driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);

		//driver.quit();
	}


}
