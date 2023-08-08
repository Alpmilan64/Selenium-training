package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		                                                                                             
		   // using chrome driver   
	                                                                                            	
		WebDriverManager.chromedriver().setup();  //  1th : setup the driver
		                                                                                        
		ChromeDriver driver = new ChromeDriver();  //2nd : Create Chrome driver object                       
		
		driver.get("http://www.saucedemo.com/");    // 3rd  :  set up URL 
	 	// This set up navigates me to Website
		
		
		// Next Step entering username & password
		
	       driver.findElement(By.id("user-name")).sendKeys("problem_user");  // --> This  will locate and send username
	       driver.findElement(By.id("password")).sendKeys("secret_sauce"); // --> This will locate and send Password
	       driver.findElement(By.xpath("//*[@id='login-button']")).click(); //  --> 
	       
	      Thread.sleep(5000);
	       
	        driver.quit();
	       
	       
	   //  driver.findElement(By.xpath("//*[@id='login-button']")).click(); --> relative xpath
	  //  driver.findElement(By.xpath("//*[@id'user-name']"));    ---> ?
	  //  driver.findElement(By.xpath("//*[@id='user-name']")); -->?
	       
	       
	       
	       
	       
	       
	       
	       
	       
		   
		   
	

	}

}
