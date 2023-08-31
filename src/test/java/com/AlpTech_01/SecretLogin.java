package com.AlpTech_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecretLogin {
	
	    public static String browser = "Chrome";
	  //  public static String browser = "Edge";
	  //  public static String browser = "Firefox";
	    
	    public static WebDriver driver;
	    
// ;lsf;koaj'lsokxg,pk
	public static void main(String[] args) throws InterruptedException {
		
		if(browser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if(browser.equals("Edge")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
			
		} else if(browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.saucedemo.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("item_4_img_link")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#continue-shopping")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		


	}

}
