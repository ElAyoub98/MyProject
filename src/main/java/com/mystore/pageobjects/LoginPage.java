package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(id = "email")
	WebElement userName;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(name = "SubmitLogin")
	WebElement signInBtn;
	
	@FindBy(id = "email_create")
	WebElement emailForNewAccount;
	
	@FindBy(name = "SubmitCreate")
	WebElement createNewAccountBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname, String pass) {
		Action.type(userName, uname);
		Action.type(password, pass);
		Action.click(getDriver(), signInBtn);
		return new HomePage();
	}
	
	public AddressPage login1(String uname, String pass) {
		Action.type(userName, uname);
		Action.type(password, pass);
		Action.click(getDriver(), signInBtn);
		return new AddressPage();
	}
	
	public AccountCreationPage createNewAccount(String email) {
		Action.type(emailForNewAccount, email);
		Action.click(getDriver(), createNewAccountBtn);
		return new AccountCreationPage();
	}
	
}
