package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.utility.Log;

public class IndexPageTest extends BaseClass {
	
    IndexPage indexpage;
	

	
	@Test(groups = "Smoke")
	public void verifyLogo() {
		indexpage = new IndexPage();
		boolean result = indexpage.validateLogo();	
		Assert.assertTrue(result);
	}
	
	@Test(groups = "Smoke")
	public void verifyTitle() {
		Log.startTestCase("verify Title");
		String title = indexpage.getMyStoreTitle();
		//Assert.assertEquals(title, "My Store");
		Assert.assertEquals(title, "My Store!!");
		Log.endTestCase("verify Title");

	}

}
