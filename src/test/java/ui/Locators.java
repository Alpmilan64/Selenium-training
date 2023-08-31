package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	                  public static String browser = "Chrome";
	                  public static WebDriver driver;
	                  
	public static void main(String[] args) throws InterruptedException {
		
		               if ( browser.equals("Chrome")) {
		            	   
		            	   WebDriverManager.chromedriver().setup();
		            	   
		            	   driver = new ChromeDriver();
		            	   
		               }else if (browser.equals("edge")) {
		            	   
		            	   WebDriverManager.edgedriver().setup();
		            	   
		            	   driver = new EdgeDriver();
		            	   
		               } else if (browser.equals("firefox")) {
		            	   
		            	   WebDriverManager.firefoxdriver().setup();
		            	   
		            	   driver = new FirefoxDriver();
		               }
		               
		                    driver.get("http://www.saucedemo.com/");
		               
		              driver.findElement(By.id("user-name")).sendKeys("problem_user");
		              driver.findElement(By.id("password")).sendKeys("secret_sauce");
		              driver.findElement(By.xpath("//*[@id='login-button']")).click();
		              
		             driver.manage().window().maximize();
		           
		                Thread.sleep(5000);
		                driver.close();
		               
		           
		              
		               
		                 
		           
	}

}
