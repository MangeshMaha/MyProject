package com.nmdc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class propertyTax {

	@FindBy(xpath="(//span[@class='menuText MainMenuText'])[3]")private WebElement propTax;
	@FindBy(xpath="//span[contains(text(),'Property Creation')]")private WebElement propCre;
	@FindBy(xpath="//a[contains(text(),'Creation Request')]")private WebElement CreReq;

	
	public propertyTax (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void propTax() 
	{
		propTax.click();
		propCre.click();
		CreReq.click();
			
	}
	
}
