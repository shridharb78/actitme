package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterNameTxtBx;
	
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionBox;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement selectCustDrpDwn;
	
	@FindBy(xpath="(//div[@class='itemRow cpItemRow '])[3]")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='taskManagementHeaderPanel hasSelectedCustomer']/div[2]/div[1]/div/div[1]")
	private WebElement actualCustomerTitle;
	
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCustomer(String customerName, String description)
	{
		addNewBtn.click();
		newCustomer.click();
		enterNameTxtBx.sendKeys(customerName);
		descriptionBox.sendKeys(description);
		selectCustDrpDwn.click();
		ourCompanyOption.click();
		createCustomerBtn.click();
		
		
	}
	
	public String getActualCustomerTitle()
	{
		return actualCustomerTitle.getText();
	}
	
	
	
	

}
