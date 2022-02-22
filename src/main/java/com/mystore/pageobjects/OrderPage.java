package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class OrderPage extends BaseClass {

	@FindBy(xpath = "//td[@class='cart_unit']/span/span")
	WebElement unitPrice;
	
	@FindBy(id = "total_price")
	WebElement totalPrice;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedToChckOut;
	
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public double getUnitPrice() {
		String unitprix = unitPrice.getText();
		String unit = unitprix.replaceAll("[^a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100; //hit ghadi ymssh tal . w hna 3ndna 3adad float w hna mhtajin fassila
	}
	
	public double getTotaltPrice() {
		String totalprix = totalPrice.getText();
		String tot = totalprix.replaceAll("[^a-zA-Z0-9]", "");
		double finalTotalPrice = Double.parseDouble(tot);
		return finalTotalPrice/100;
	}
	
	public LoginPage clickOnCheckOut() {
		Action.click(getDriver(), proceedToChckOut);
		return new LoginPage();
	}
	
	
	
	
	
}
