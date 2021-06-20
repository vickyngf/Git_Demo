package com.org.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Test {
	ExtentHtmlReporter  extentreport = new ExtentHtmlReporter("C:\\Users\\anuj.dubey\\eclipse-workspace\\Home_Automation\\test-output\\testreport.html");
	 ExtentTest testcase = new ExtentTest();
	 ExtentReports report = new ExtentReports();
	 report.
	public static WebDriver driver;
	
	 
	      report.
	
	public void 
	
	
	
	
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
