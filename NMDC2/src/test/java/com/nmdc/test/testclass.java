package com.nmdc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nmdc.pages.CreationRequest;
import com.nmdc.pages.Login;
import com.nmdc.pages.OwnerDetails;
import com.nmdc.pages.propertyTax;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
	System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	WebDriverManager.chromedriver().setup();
//	ChromeDriver driver = new ChromeDriver();
	driver.get("http://fluentgrid-erp.sctestingsite.com/auth/login");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	Login page1=new Login(driver);
	page1.UN();
	page1.pwd();
	page1.btn();
	
	propertyTax page2=new propertyTax(driver);
	page2.propTax();
	
	CreationRequest page3=new CreationRequest(driver);
	page3.PropDetails();
	
	OwnerDetails page4=new OwnerDetails (driver);
	page4.Owner();
	
	//driver.findElement(By.xpath("//nb-card-body/div[1]/div[1]/div[1]/div[1]/div[1]/nb-select[1]/button[1]"));

}
}
