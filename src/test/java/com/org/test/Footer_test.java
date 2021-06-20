package com.org.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.base.Base_Test;
import com.org.pageobject.Footer_page;

public class Footer_test extends Base_Test{
	
	static Footer_page ftext ;
	
	@BeforeMethod
	public static void switchto() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("Footer");
		ftext = new Footer_page();
	}
	
	@Test
      public static void showtext() {
    	  ftext.getFootertext().getTagName();
      }

}
