package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase
{
	@Test
	public void verifyBuySamsungGalaxy6()
	{
		h.clickOnPhones();
		h.buySamsungGalaxy6();
		util.addToCart();
	}

	@Test
	public void verifyBuyNokiaLumia1520()
	{
		h.clickOnPhones();
		h.buyNokiaLumia1520();
		util.addToCart();
	}
	
	@Test
	public void verifyBuySonyVaioI5()
	{
		h.clickOnLaptops();
		h.buySonyVaioI5();
		util.addToCart();
	}
	
	@Test
	public void verifyBuySonyVaioI7()
	{
		h.clickOnLaptops();
		h.buySonyVaioI7();
		util.addToCart();
	}
	
	@Test
	public void verifyBuyAppleMonitor24()
	{
		h.clickOnMonitors();
		h.buyAppleMonitor24();
	}
	
	@Test
	public void verifyBuyAsusFullHd()
	{
		h.clickOnMonitors();
		h.buyAsusFullHd();
		util.addToCart();
	}

}
