package com.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void openbrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.dubey\\Anuj_Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/anuj.dubey/Anuj_Selenium/WebSite/WebSite/Home.html");
	
	
	}
	
	
	 @AfterClass
	  public static void closebrowser() { 
		  driver.close(); 
		  }
	 
	

}
