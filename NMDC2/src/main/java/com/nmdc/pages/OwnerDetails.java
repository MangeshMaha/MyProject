package com.nmdc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerDetails {

	@FindBy(xpath="//input[@id='firstname_0']")private WebElement FName;
	@FindBy(xpath="//input[@id='lastname_0']")private WebElement LName;
	@FindBy(xpath="//input[@id='mobileno_0']")private WebElement MNo;
	@FindBy(xpath="//input[@id='email_0']")private WebElement Email;
	@FindBy(xpath="//tbody/tr[1]/td[6]/nb-select[1]/button[1]")private WebElement Gender;
	@FindBy(xpath="//nb-option[contains(text(),'Male')]")private WebElement Male;
	@FindBy(xpath="//tbody/tr[1]/td[7]/nb-select[1]/button[1]")private WebElement PHC;
	@FindBy(xpath="//nb-option[contains(text(),'No')]")private WebElement No;
	@FindBy(xpath="//tbody/tr[1]/td[8]/nb-select[1]/button[1]")private WebElement SeniorC;
	@FindBy(xpath="//nb-option[contains(text(),'Yes')]")private WebElement Yes;
	
	
	public OwnerDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void Owner()
	{
		FName.sendKeys("Admin");
		LName.sendKeys("Admin");
		MNo.sendKeys("1234567890");
		Email.sendKeys("admin@nmdc.com");
		Gender.click();
		Male.click();
		PHC.click();
		No.click();
		SeniorC.click();
		Yes.click();
		
	}
	
}
