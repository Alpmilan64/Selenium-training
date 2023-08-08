package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {



	
	// Global Variable: I can manage whole automation suit on differnet borowser without changing the code
	
	public static String  browser = "Chrome";  // --> Chrome or Firefox or etc.. Just change Browser
	
	public static WebDriver  driver;
	

	public static void main(String[] args) throws InterruptedException  {

		if ( browser.equals ("Firefox"))  {

			WebDriverManager.firefoxdriver().setup();

		     driver = new FirefoxDriver();

		} else if ( browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			
		}  else if ( browser.equals("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			
		 	driver = new EdgeDriver();
		}
		     
		driver.get("http://www.saucedemo.com");

		//driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("problem_user"); // Manual xpath
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user"); // copy-paste xpath


		// driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");// manual xpath
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");// copy-paste xpath

		driver.findElement(By.xpath("//*[@id='login-button']")).click();

		Thread.sleep(5000);
		driver.close();





	}

}
