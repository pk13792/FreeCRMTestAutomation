package com.qa.com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.com.util.TestUtil;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	public Testbase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Prerna\\eclipse-workspace\\TestAuto\\src\\main\\java\\com\\qa\\com\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		
		else if(browsername.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\chromedriver_win32\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
