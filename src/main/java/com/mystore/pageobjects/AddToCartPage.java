package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddToCartPage extends BaseClass{

	@FindBy(name = "qty")
	WebElement quantity;
	
	@FindBy(name = "group_1")
	WebElement size;
	
	@FindBy(xpath = "//span[text() = 'Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]//h2/i")
	WebElement addToCartMessage;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void enterQuantity(String qnt) {
		Action.type(quantity, qnt);
	}
	
	public void selectSize(String s) {
		Action.selectByVisibleText(s, size);
	}
	
	public void clickOnAddToCart() {
		Action.click(getDriver(), addToCartBtn);
	}
	
	public boolean validateAddtoCart() {
		Action.fluentWait(getDriver(), addToCartMessage, 10);
		return Action.isDisplayed(getDriver(), addToCartMessage);
		
	}
	
	public OrderPage clickOnCheckOut() throws Exception {
		Action.fluentWait(getDriver(), proceedToCheckOutBtn, 10);
		Action.JSClick(getDriver(), proceedToCheckOutBtn);//we need js method to click on this button
		return new OrderPage();
	}
	
	
	
}
