package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

public class LoginPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;  
	HomePage homePage;

	
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class, groups = {"Sanity" , "Smoke"}) 
	public void loginTest(String username, String password) {
		Log.startTestCase("loginTest");
		indexPage = new IndexPage();
		Log.info("user is going to click on sign In");
	    loginPage = indexPage.clickOnSignIn();
	    Log.info("enter username and password");
	    
		//String username = prop.getProperty("username");
		//String password = prop.getProperty("password");
		//homePage = loginPage.login(username, password);
	    
	    homePage = loginPage.login(username, password);
	    
		String actualURL = homePage.getCurrURL();
		String expectedURL = "http://automationpractice.com/index.php?controller=my-account";
		Log.info("Verifying if user is able to login");
		Assert.assertEquals(actualURL, expectedURL);
		Log.info("Login is success!!!");
		Log.endTestCase("loginTest");

		
	}
}
