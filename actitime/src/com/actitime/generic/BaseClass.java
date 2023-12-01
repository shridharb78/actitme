package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	FileLib f= new FileLib();
	
	@BeforeClass  
	public void openBrowser() throws IOException
	{
		Reporter.log("Open Browser and enter the url",true);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url=f.getPropertyData("url");
		driver.get(url);
		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("Login",true);
		LoginPage l= new LoginPage(driver);
		String un=f.getPropertyData("username");
		String pwd= f.getPropertyData("password");
		
		l.setLogin(un, pwd);
	}
	@AfterMethod(enabled=false)
	public void logout()
	{
		Reporter.log("Logout",true);
		HomePage h= new HomePage(driver); 
		h.setLogout();
	}
	@AfterClass(enabled=false)
	public void closeBrowser()
	{
		
		Reporter.log("Close Browser",true);
		driver.quit();
		
	}

	
	

}
