package com.nmdc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="input-email")private WebElement UN;
	@FindBy(id="input-password")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement btn;
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UN() {
		UN.sendKeys("admin");		
	}
	public void pwd() {
		pwd.sendKeys("Ndmc@123");
	}
	public void btn() {
		btn.click();
	}
	
}
