package com.AlpTech_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Demo {
	
	                 public static String browser ="Chrome";
	                 
	                 public static WebDriver driver;
	
	               public static void main(String[] args) {
	            	   
	            	   if (browser.equals("Chrome")) {
	            		   
	            		   WebDriverManager.chromedriver().setup();
	            		   WebDriver driver = new ChromeDriver();
	            		   
	            	   }else if(browser.equals("Edge")) {
	            		   
	            		   WebDriverManager.chromedriver().setup();
	            		   
	            		   WebDriver driver = new EdgeDriver();
	            		   
	            	   } else if
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
					
				}

}
