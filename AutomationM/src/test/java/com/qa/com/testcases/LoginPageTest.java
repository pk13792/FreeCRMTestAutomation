 package com.qa.com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.com.base.Testbase;
import com.qa.com.pages.LoginPage;

public class LoginPageTest extends Testbase{
	
	LoginPage loginPage;
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	@Test(priority =1)
	public void LoginPageTitleTest() {
	
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	@Test(priority =2)
	public void logoTest() {
		Boolean Flag = loginPage.Validatelogo();
		Assert.assertTrue(Flag);
	}
	@Test(priority =3)
	public void loginTest() throws InterruptedException {
		loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
