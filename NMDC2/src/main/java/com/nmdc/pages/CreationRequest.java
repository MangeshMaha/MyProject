package com.nmdc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreationRequest {

//	@FindBy(xpath="//nb-select[@id='property_type']")private WebElement propType;
//	@FindBy(xpath="//nb-option[contains(text(),'House Under Constrn')]")private WebElement HuC;
//	@FindBy(xpath="//nb-card-body/div[1]/div[2]/div[1]/div[1]/div[1]/nb-select[1]/button[1]")private WebElement EstType;
//	@FindBy(xpath="//nb-option[contains(text(),'Bunglow')]")private WebElement Bunglw;
//	@FindBy(xpath="//input[@id='seat_no']")private WebElement SeatN;

	@FindBy(xpath="//input[@id='latitude']")private WebElement Lattitude;
	@FindBy(xpath="//input[@id='longitude']")private WebElement Longitude;
	
	public CreationRequest (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void PropDetails()
	{
//		propType.click();
//		HuC.click();
//		Bunglw.click();
//		SeatN.click();
		Lattitude.sendKeys("27.2046 N");
		Longitude.sendKeys("77.4977 E");
	}
	
}
