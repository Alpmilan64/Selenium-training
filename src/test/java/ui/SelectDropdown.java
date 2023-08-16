package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static String browser = "Chrome";

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browser.equals("Edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		} else if (browser.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
		}


		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		  WebElement  ddown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		  Select select = new Select(ddown);
		  Thread.sleep(3000);
		 
		  
		              // now we can call the select methods
		 
		   select.selectByValue("search-alias=fashion-womens");
	  // select.selectByVisibleText("search-alias=fashion-womens");
		  
		   
		     Thread.sleep(3000);
		     
		   driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		 // This is amazon DD select box is different. I can use <selectByValue , But  not use < selectByVisibleTex>
		// tree mothods  < selectByValue, or VisibleText, or index. some select text boxes are different than others...
		
















		//  WebElement ddown = driver.findElement(By.xpath("//*[@id='nav_ya_signin']"));
		// create  object for the select class

		//Select  select = new Select(ddown); 

		// select dropdown is mean i select options from drop down list. it is my options

		//  select.deselectByValue("Woman"); //  1 - 10  employees
		//Thread.sleep(3000);
		//  select.selectByVisibleText("Woman"); // 5-100 employees
		//  Thread.sleep(3000);
		// select.deselectByIndex(5); // index has set up. count from start 0 untill 5
		// Thread.sleep(3000);








	}

}
