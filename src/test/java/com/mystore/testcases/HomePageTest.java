package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;

	
	@Test(groups = "Smoke")
	public void wishListTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		homePage = loginPage.login(username, password);
		boolean result = homePage.validateMyishList();
		Assert.assertTrue(false);
		//Assert.assertTrue(result);
	}
	
	
	@Test(groups = "Smoke")
	public void orderHistoryDetailsTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		homePage = loginPage.login(username, password);
		boolean result = homePage.validateOrderHistory();
		Assert.assertTrue(result);
	}

	
}
