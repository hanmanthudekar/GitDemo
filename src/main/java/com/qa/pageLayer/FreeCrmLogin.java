package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.CRMTestBase;

public class FreeCrmLogin extends CRMTestBase
{

	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement uname;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement pwd;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	private WebElement loginButton;
	
	public FreeCrmLogin() {
	PageFactory.initElements(driver, null);
	}
	
	public void setUsername(String username) {
		uname.sendKeys(username);
	}
	
	public void setPassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
