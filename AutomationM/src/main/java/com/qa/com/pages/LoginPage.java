package com.qa.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.com.base.Testbase;

public class LoginPage extends Testbase{
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//font[text()= 'Sign Up']")
	WebElement SignUpbtn;
	
	@FindBy(xpath = "//img[@alt='free crm logo']")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

	public String ValidateLoginPageTitle() {
		 return driver.getTitle();
	}
	
	public boolean Validatelogo() {
		return logo.isDisplayed();
		
	}
	
	public HomePage Login(String un, String pwd) throws InterruptedException {

		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		LoginBtn.click();
		return new HomePage();
	}
}
