package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.Base_Test;

public class LeftMenu_Page extends Base_Test{

	private WebElement Seleniumlink;
	private WebElement SoapUIlink;
	private WebElement Jmeterlink;
	private WebElement Corejavalink;
	private WebElement manualtestinglink;
	private WebElement Registeruserlink;
	
	public WebElement getSeleniumlink() {
		Seleniumlink = driver.findElement(By.xpath("//a[text()='Selenium']"));
		return Seleniumlink;
	}
	public WebElement getSoapUIlink() {
		SoapUIlink = driver.findElement(By.xpath("//a[text()='Soap UI']"));
		return SoapUIlink;
	}
	public WebElement getJmeterlink() {
		Jmeterlink = driver.findElement(By.xpath("//a[text()='JMeter']"));
		return Jmeterlink;
	}
	public WebElement getCorejavalink() {
		Corejavalink = driver.findElement(By.xpath("//a[text()='Core Java']"));
		return Corejavalink;
	}
	public WebElement getManualtestinglink() {
		manualtestinglink = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		return manualtestinglink;
	}
	public WebElement getRegisteruserlink() {
		Registeruserlink = driver.findElement(By.xpath("//a[text()='Register User']"));
		return Registeruserlink;
	}
}
