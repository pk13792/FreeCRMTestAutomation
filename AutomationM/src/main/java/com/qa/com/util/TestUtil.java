package com.qa.com.util;

import org.openqa.selenium.WebElement;

import com.qa.com.base.Testbase;

public class TestUtil extends Testbase{

	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToFrame(WebElement frameName){
		driver.switchTo().frame(frameName);
		
	}
	
}
