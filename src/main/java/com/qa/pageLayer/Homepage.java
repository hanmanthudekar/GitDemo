package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Homepage extends TestBase
{

	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phones;
	
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	private WebElement laptops;
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	private WebElement monitors;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsung_galaxy_6;
	
	@FindBy(xpath="//a[contains(text(),'Nokia lumia 1520')]")
	private WebElement nokia_lumia_1520;

	@FindBy(xpath="//a[contains(text(),'Sony vaio i5')]")
	private WebElement Sony_vaio_i5;
	
	@FindBy(xpath="//a[contains(text(),'Sony vaio i7')]")
	private WebElement sony_vaio_i7;
	
	@FindBy(xpath="//a[contains(text(),'Apple monitor 24')]")
	private WebElement apple_monitor_24;
	
	@FindBy(xpath="//a[contains(text(),'ASUS Full HD')]")
	private WebElement aSUS_Full_Hd;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPhones() 
	{
		phones.click();
	}
	public void clickOnLaptops() 
	{
		laptops.click();
	}
	public void clickOnMonitors()
	{
		monitors.click();
	}
	public void buySamsungGalaxy6()
	{
		samsung_galaxy_6.click();
	}
	public void buyNokiaLumia1520()
	{
		nokia_lumia_1520.click();
	}
	public void buySonyVaioI5() 
	{
		Sony_vaio_i5.click();
	}
	public void buySonyVaioI7()
	{
		sony_vaio_i7.click();	
	}
	public void buyAppleMonitor24()
	{
		apple_monitor_24.click();
	}
	public void buyAsusFullHd()
	{
		aSUS_Full_Hd.click();
	}
}
