package com.AlpTech_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	    	      public static WebDriver driver;

	       // This method will initialize the driver 	      
	     public static void setUp() {
	   	
	   		ConfigsReader.readProperties(Constans.CONFIGURATION_FILEPATH);
	   
	   		switch( ConfigsReader.getProperty("browser").toLowerCase()) {
	   		case  "chrome":
	   			System.setProperty(" webdriver.chrome.driver ", Constans.CHROME_DRIVER_PATH);      
	   			driver = new ChromeDriver();
	   			break;     // if i don't use break, it will open 2 browser in same time
	   		case "firefox":
	   			System.setProperty(" webdriver.gecko.driver ", Constans.GECKO_DRIVER_PATH);  
	   			driver = new FirefoxDriver();
	   			break;
	   			default:
	   			throw new RuntimeException("Browser is not supported");
	   			//This is ,if it is not chrome or firefox Browser
	   		}
	   		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));	
	   	 driver. manage().window().maximize();
	   	driver.get(ConfigsReader.getProperty("url"));
	      }
	   /**
	    * This method will  quit the browser 	   
	    */
	    	 public static void tearDown() {
	    		 
	    		 if (driver != null) {
	    		  driver.quit(); 
	       }
	    		 
	    	 }
	    	   
	    	 
   /** this is the set up for for setUp() method    
	 Every time,, it will  first read configs file
	 second opened the right Browser
      third maximize  the window
     and go to specific url 
      public method: can access from any where, Static method:   	       
      no need to  creating Object, void method: no return value	              
	  job of the tearDown() method   
	  close it down  Basically interview questions what is setup() and 
	  tearDown() methods
	*/
	    	   
	    	   
	    	   
	          
}
