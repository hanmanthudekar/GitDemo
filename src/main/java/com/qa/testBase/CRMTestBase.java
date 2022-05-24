package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.FreeCrmLogin;
import com.qa.pageLayer.Homepage;
import com.qa.utilities.CRMUtilClass;
import com.qa.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMTestBase {

	public static WebDriver driver;
	public FreeCrmLogin login;
	public CRMUtilClass u;

	@BeforeMethod
	public void launchDriver() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ui.freecrm.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		login = new FreeCrmLogin();
		u = new CRMUtilClass();
	}
	@AfterMethod
	public void closeDriver()
	{
		driver.quit();
	}
}
