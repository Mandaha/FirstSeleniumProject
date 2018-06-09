package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/mandaha/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		
//		System.setProperty("webdriver.gecko.driver", "/Users/mandaha/Documents/selenium dependencies/drivers/geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
//		
		
		//WebDriver driver = new SafariDriver();
	}
	

}
