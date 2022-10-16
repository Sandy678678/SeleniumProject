package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.Base;

public class AmazonHomePage extends Base {
	
	public AmazonHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchBtn;
	
	@FindBy(xpath="(//span[contains(text(),'Samsung Galaxy M53 5G')])[2]")
	private WebElement productName;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getProductName() {
		return productName;
	}
	
	
	
	

}
