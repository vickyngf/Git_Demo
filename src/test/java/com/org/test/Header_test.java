package com.org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.base.Base_Test;
import com.org.pageobject.Header_Page;

public class Header_test extends Base_Test {
	
	static Header_Page hpage;
	
	@BeforeMethod
	public static void frameswitch() {
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("Header");
		hpage = new Header_Page();
	}
	
	@Test(priority = 1)
	public static void bann () {
		hpage.getBanner().click();
	}
	
	@Test
	public static void bantext() {
		hpage.getRunningtext().click();
	}
	
	//@Test(priority = 4)
	public static void hylink() throws InterruptedException {
		hpage.getFaqlink().click();
	}
	
	//@Test(priority = 5)
	public static void windowswitch() {
	String maninwindowid = driver.getWindowHandle();	
	
	Set<String> allwindows = driver.getWindowHandles();
	 String secondwindowid = "";
	for(String currid : allwindows ) {
		if (!currid.equals(maninwindowid)){
			secondwindowid = currid;
		break;
		}
	}
	driver.switchTo().window(secondwindowid);
    driver.findElement(By.xpath("//input[@id='ques']")).sendKeys("kriti");
    driver.switchTo().window(maninwindowid);
	}
		
	

	//@Test(priority = 4)
	public static void max() {
		driver.manage().window().maximize();
	}
	
	//@Test(priority = 5)
	public static void mousehover() {
		WebElement mouse = driver.findElement(By.xpath("//a [text()='FAQ (Frquently Asked Qusetion)']"));
		Actions mh = new Actions(driver);
		mh.contextClick(mouse);
	}
	

	//@Test(priority = 4)
	public static void waitfor() {
		driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))));
	}
	
	//@Test(priority = 5)
	public static void mouse() {
		WebElement mos = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		Actions moshover = new Actions(driver);
		moshover.moveToElement(mos).build().perform();
	}

}
