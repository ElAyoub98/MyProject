package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass {
	
	IndexPage indexPage;
	LoginPage loginPage;
	AccountCreationPage accCreationPage;

	
	@Test(groups = "Sanity")
	public void verifyCreateAccountPageTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		AccountCreationPage accCreationPage = loginPage.createNewAccount("abc@efg.xyz");
		boolean result = accCreationPage.validateAccountCreatePage();
		Assert.assertTrue(result);
		
	}
}
