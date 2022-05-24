package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase{

	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement addToCart; 
	
	public UtilClass() 
	{
		PageFactory.initElements(driver, this);
	}
	public void addToCart() 
	{
		addToCart.click();
	}
	public static void takeScreenShot()
	{
		String path="location	C:\\velocityTraining\\setups\\eclipse_IDE_2021_12\\eclipse_IDE_2021_12\\MyFramework\\Screenshots\\"+System.currentTimeMillis()+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File(path);
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
