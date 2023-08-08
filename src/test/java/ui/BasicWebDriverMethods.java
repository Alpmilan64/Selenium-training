package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BasicWebDriverMethods {

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

			driver = new FirefoxDriver();
		}

		driver.get("http://www.saucedemo.com/");

		// Selenium methods :

		driver.manage().window().maximize();

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		String title = driver.getTitle();
		System.out.println(title);

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		//driver.navigate().to("https://www.google.com");
		// Thread.sleep(5000);

		// driver.quit(); // closes multiple windows
		// driver.close(); // closes current single wondow
		
		
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		
		List<WebElement>webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("http://www.amazom.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("womens top");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//*[@id='i9zvla-2lt7np-8bh67e-nevuyr']")).click();
		//driver.close();
		
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		
	//	driver.findElement(By.xpath("//*[@id='main']")).click();
		//Set<String>windowhandles = driver.getWindowHandles();
		//System.out.println(windowhandles);
		
		
		
		
		
		
		

	}

}
