package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.Base_Test;

public class Footer_page extends Base_Test{
	
	private WebElement footertext;

	public WebElement getFootertext() {
		footertext = driver.findElement(By.xpath("//table[@bgcolor='green']"));
		return footertext;
	}

}
