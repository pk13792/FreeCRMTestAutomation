package com.qa.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.com.base.Testbase;

public class HomePage extends Testbase {
	
 @FindBy(xpath ="//a[@title = 'Contacts']")
 WebElement ContactsTab;
 
 @FindBy(xpath="//a[@title = 'Deals']")
 WebElement DealsTab;
 
 @FindBy(xpath = "//a[@title = 'Tasks']")
 WebElement Taskstab;
 
 @FindBy(xpath = "//td[contains(text(),'Prerna Kumar')]")
 WebElement LoginUser;
 
 public void ValidationHomePageTitle(){
	 String HomePageTitle = driver.getTitle();
 }
 
}
