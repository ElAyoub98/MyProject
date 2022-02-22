package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath = "//*[text() = 'My wishlists']")
	WebElement myWishlists;
	
	@FindBy(xpath = "//*[text() = 'Order history and details']")
	WebElement orderHistory;
	

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public boolean validateMyishList() {
		return Action.isDisplayed(getDriver(), myWishlists);
	}
	
	public boolean validateOrderHistory() {
		return Action.isDisplayed(getDriver(), orderHistory);
	}



	public String getCurrURL() {
		String homePageURL = getDriver().getCurrentUrl();
		return homePageURL;
	}
	
}
