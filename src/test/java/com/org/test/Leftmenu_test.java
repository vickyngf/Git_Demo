package com.org.test;

import org.testng.annotations.Test;

import com.org.base.Base_Test;
import com.org.pageobject.LeftMenu_Page;

public class Leftmenu_test extends Base_Test{
	
	static LeftMenu_Page lef = new LeftMenu_Page();
	 
	@Test(priority = 1)
	public static void frameswitch(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("LeftMenu");
	}
	
	@Test(priority = 2)
	public static void opensellink() {
		lef.getSeleniumlink().click();
		
	}
		@Test(priority = 3)
		public static void  sopui() {
			lef.getSoapUIlink().click();
		}
	
		@Test(priority = 4)
		public static void jmet() {
			lef.getJmeterlink().click();
		}
		
		@Test(priority = 5)
		public static void coreja() {
			lef.getCorejavalink().click();
		}
		
		//@Test(priority = 3)
		public static void mtesting() {
			lef.getManualtestinglink().click();
		}
		
		//@Test(priority = 4)
		public static void ureg() {
			lef.getRegisteruserlink().click();
		}
}