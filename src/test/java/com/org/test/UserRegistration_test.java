package com.org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.org.base.Base_Test;
import com.org.pageobject.UserRegistration_page;

public class UserRegistration_test extends Base_Test{

	static UserRegistration_page user;
	
	
	@BeforeMethod
	public static void frameswitch() {
		driver.switchTo().defaultContent();
			driver.switchTo().frame("UserRegistration");
			user = new UserRegistration_page();
	}
	
	@Test(priority = 1)
	public static void first() {
		user.getFname().sendKeys("Anuj");
	}
	
	@Test(priority = 2)
	public static void middle() {
		user.getMname().sendKeys("Kumar");
	}
	
	@Test
	public static void last() {
		user.getLname().sendKeys("Dubey");
	}
	
	@Test
	public static void agef() {
		user.getAge().sendKeys("27");
	}
	
	@Test
	public static void marital() {
		WebElement dd = driver.findElement(By.xpath("//select[@id='marital']"));
		Select dvalue = new Select(dd);
		dvalue.selectByVisibleText("Married");
	}
	
	
    @Test
	public static void gen() {
		user.getGender().click();
	}
	
    
    @Test
	public static void subj() {
		user.getSubject().click();
	}
	
    @Test
	public static void upload() throws InterruptedException {
		user.getUploadpic().sendKeys("C:\\Users\\anuj.dubey\\Desktop\\CTFL-new.jpg");
		Thread.sleep(2000);
	}
	
    @Test
	public static void rebut() throws InterruptedException {
		user.getRegisterbutton().click();
		Thread.sleep(2000);
	}
    
    
    @Test
    public static void alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
    
    @Test
    public static void screenshot() throws IOException {
    	TakesScreenshot tss = (TakesScreenshot)driver;
    	File src = tss.getScreenshotAs(OutputType.FILE);
    	File trg = new File("C:\\Users\\anuj.dubey\\Desktop\\error.doc");
    	Files.copy(src, trg);
    
    }
    
   // @Test(priority = 13)
    public static void window() {
    	JavascriptExecutor je = (JavascriptExecutor)driver;
    	je.executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(0));
    driver.get("http://google.com");
    }
}
