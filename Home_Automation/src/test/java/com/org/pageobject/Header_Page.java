package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.Base_Test;

public class Header_Page extends Base_Test{
	
	private WebElement banner;
	private WebElement  runningtext;
	private WebElement faqlink;
	
	public WebElement getBanner() {
		banner = driver.findElement(By.xpath("//img[@src='Banner.jpg']"));
		return banner;
	}
	public WebElement getRunningtext() {
		runningtext = driver.findElement(By.xpath("//font[text()='Please pay your fees after completing 2 Demo classes.']"));
		return runningtext;
	}
	public WebElement getFaqlink() {
		faqlink = driver.findElement(By.xpath("//a [text()='FAQ (Frquently Asked Qusetion)']"));
		return faqlink;
	}
	

}
