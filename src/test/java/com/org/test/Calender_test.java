package com.org.test;

import org.testng.annotations.Test;

import com.org.base.Base_Test;
import com.org.pageobject.Calender_page;

public class Calender_test extends Base_Test{
	
	static Calender_page cal = new Calender_page();
	
	@Test(priority = 1 )
	public static void switchto() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("Calender");
	}

	
	
	@Test(priority = 2)
	public static void setdate() {
		cal.getDatesetter().sendKeys("2021-05-23");
	}

}
