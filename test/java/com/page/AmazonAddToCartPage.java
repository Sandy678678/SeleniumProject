package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.Base;

public class AmazonAddToCartPage extends Base {

	public AmazonAddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
	private WebElement addToCartBtn;

	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	private WebElement proceedTocheckoutBtn;

	@FindBy(id = "ap_email")
	private WebElement emailField;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(id = "ap_password")
	private WebElement passwordField;

	@FindBy(id = "signInSubmit")
	private WebElement signInBtn;

	@FindBy(xpath = "(//input[@name='submissionURL'])[3]")
	private WebElement selectAddress;

	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement useAddressBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getProceedTocheckoutBtn() {
		return proceedTocheckoutBtn;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getSelectAddress() {
		return selectAddress;
	}

	public WebElement getUseAddressBtn() {
		return useAddressBtn;
	}

}
