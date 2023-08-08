package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverDemo {

	public static void main(String[] args) throws InterruptedException   {   


                            // System.setProperty("webdriver.chrome.driver" , "driver/chromedriver.exe");
		
			
		 WebDriverManager.chromedriver().setup();
		 // this will replace .setProperty path

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("http://www.amazon.com");
		

		Thread.sleep(5000);
		
		 driver.close();

	

	}

}
