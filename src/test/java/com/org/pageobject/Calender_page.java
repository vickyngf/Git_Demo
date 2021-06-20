package com.org.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.Base_Test;

public class Calender_page extends Base_Test {

	
	private WebElement datesetter;

	public WebElement getDatesetter() {
		datesetter = driver.findElement(By.xpath("//input[@class='form-control']"));
		return datesetter;
	} 
	
	
}