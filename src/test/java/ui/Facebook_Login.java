package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {


         public static String browser = "Chrome";
       // public static String browser = "Edge";
       // public static String browser ="Firefox";
        
        public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	

if (browser.equals("Edge")) {
	
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	
	
}else if (browser.equals("Chrome")) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
} else if (browser .equals("Firefox")) {
	
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();						
}

    //.get("http://www.Facebook.com/");
    driver.navigate().to("http://www.facebook.com");
    
 driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("problem_user");
 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
 driver.findElement(By.cssSelector("#login-button")).click();
 Thread.sleep(3000);
 driver.close();

	}

}
