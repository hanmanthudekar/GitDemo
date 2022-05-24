package com.qa.FreeCRMlogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.testBase.CRMTestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestClass extends CRMTestBase{

	@DataProvider
	public Object[][] getTestData() {
		Object [][] data=u.getTestData("Login");
		return data;
	}

	@Test(dataProvider="getTestData")
	public void loginTest() {
		login.setUsername(null);
		login.setPassword(null);
		login.clickOnLoginButton();
	}

}
