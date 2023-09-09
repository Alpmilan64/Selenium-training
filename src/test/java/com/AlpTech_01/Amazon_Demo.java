package com.AlpTech_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Demo {
	
	                 public static String browser ="Chrome";
	                 
	                 public static WebDriver driver;
	
	               public static void main(String[] args) {
	            	   
	            	   if (browser.equals("Chrome")) {
	            		   
	            		   WebDriverManager.chromedriver().setup();
	            		    driver = new ChromeDriver();
	            		   
	            	   }else if(browser.equals("Edge")) {
	            		   
	            		   WebDriverManager.chromedriver().setup();
	            		   
	            		    driver = new EdgeDriver();
	            		   
	            	   } else if(browser.equals("Firefox")) {
	            		   
	            		   WebDriverManager.firefoxdriver().setup();
	            		   
	            		   driver = new FirefoxDriver();
	            	   }
	            	   
	            	   
	            	  driver.get("https://www.google.com/"); 
	            	  
	            	  driver.close();
	            	  
	           // List<WebElement>	driver.findElements(By.tagName("#content"));
	         //   int sizeofdriver=driver.size();
	        //  System.out.println(sizeofdriver);
	            	
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
					
				}

					
				}


