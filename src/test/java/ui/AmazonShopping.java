package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonShopping {

	public static void main(String[] args)  {
	
		
		    WebDriverManager.chromedriver().setup();
		    
		  //  WebDriver  driver = new EdgeDriver();
		    WebDriver  driver = new ChromeDriver();
		 //  WebDriver driver = new FirefoxDriver();
		    
		    driver.get("https://www.amazon.com");
		    
		    // i am navigated to the amazon  now do the steps
		    
		     driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("womens tops");
		     
		   driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("womens tunic tops")).click();
		    
		    
		 //   Thread.sleep(5000);
		  //  driver.findElement(By.xpath("//*[@id=['celwidget nav-sprite-v1']")).sendKeys("scroll_down");
		   
		    
		  //  driver.quit();
		   
		    
		   // Thread.sleep(5000);
		  //  driver.manage().window().minimize();
		   // driver.findElement(By.xpath("//*[@id='haxmp-yck1u9-kmbmox-8dgllr']")).click();
		    
		  //  driver.findElement(By.xpath("//*[@id='a-section a-spacing-mini _cDEzb_noop_3Xbw5']")).click();
		    
		   
		    
		

	}

}
