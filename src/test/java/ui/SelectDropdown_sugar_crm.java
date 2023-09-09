package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown_sugar_crm {
  
	
	     public static String browser = "Chrome";
	     
	     public static WebDriver driver;
	     
	public static void main(String[] args) throws InterruptedException {
		
		if ( browser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.name("employees_c"));
		
		Select select = new Select(ddown);
		
		select.selectByValue("level1");	
		//Thread.sleep(2000);
	    select.selectByVisibleText("51-100 employees");
	  //  Thread.sleep(2000);
		select.selectByIndex(5);
		//Thread.sleep(2000);
		
	  // so we have 3 options for select method.	
		    
		    driver.close();

	}

}
