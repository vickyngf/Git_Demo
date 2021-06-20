package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.Base_Test;

public class UserRegistration_page extends Base_Test{
	
	private WebElement fname;
	private WebElement mname;
	private WebElement lname;
	private WebElement age;
	private WebElement mstatus;
	private WebElement gender;
	private WebElement subject;
	private WebElement uploadpic;
	private WebElement registerbutton;
	
	
	public WebElement getFname() {
		fname = driver.findElement(By.xpath("//input[@id='fname']"));
		return fname;
	}
	public WebElement getMname() {
		mname = driver.findElement(By.xpath("//input[@id='mname']"));
		return mname;
	}
	public WebElement getLname() {
		lname = driver.findElement(By.xpath("//input[@id='lname']"));
		return lname;
	}
	public WebElement getAge() {
		age = driver.findElement(By.xpath("//input[@id='age']"));
		return age;
	}
	public WebElement getMstatus() {
		mstatus = driver.findElement(By.xpath("//option[text()='Married']"));
		return mstatus;
	}
	public WebElement getGender() {
		gender = driver.findElement(By.xpath("//input[@value='Male']"));
		return gender;
	}
	public WebElement getSubject() {
		subject = driver.findElement(By.xpath("//input[@name='jmeter']"));
		return subject;
	}
	public WebElement getUploadpic() {
		uploadpic = driver.findElement(By.xpath("//input[@id='file']"));
		return uploadpic;
	}
	public WebElement getRegisterbutton() {
		registerbutton = driver.findElement(By.xpath("//input[@id='Register']"));
		return registerbutton;
	}
	

}
