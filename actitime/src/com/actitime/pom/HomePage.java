package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasksTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout()
	{
		logoutLink.click();
	}
	
	public void clickTasksTab()
	{
		tasksTab.click();
	}

}
