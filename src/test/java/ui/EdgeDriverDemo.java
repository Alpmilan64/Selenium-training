package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverDemo {

	public static void main(String[] args) {
		
		            WebDriverManager.edgedriver().setup();
		            
		            WebDriver driver = new EdgeDriver();
		            
		            driver.get("https://www.amazon.com");
		
                       driver.close();
	}

}
