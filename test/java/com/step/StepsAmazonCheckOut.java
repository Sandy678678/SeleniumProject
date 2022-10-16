package com.step;



import java.io.IOException;

import com.page.AmazonAddToCartPage;
import com.page.AmazonHomePage;
import com.runner.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsAmazonCheckOut extends Base{
	
	AmazonHomePage a;
	AmazonAddToCartPage a1 = new AmazonAddToCartPage();
	
	
	@Given("User launches Amazon home page")
	public void user_launches_amazon_home_page() {
		
		browserlaunch();
	    
	}
	@When("User enters product name {string} in search box")
	public void user_enters_product_name_in_search_box(String prodName) {
		AmazonHomePage a = new AmazonHomePage();
		a.getSearchBox().sendKeys(prodName);
	    
	}
	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		a.getSearchBtn().click();
	   
	}
	@When("User clicks on the product name")
	public void user_clicks_on_the_product_name() {
		a.getProductName().click();
	   
	}
	@When("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		switchWindow();
		a1.getAddToCartBtn().click();
	    
	}
	@When("User clicks on proceed to buy button")
	public void user_clicks_on_proceed_to_buy_button() {
		a1.getProceedTocheckoutBtn().click();
	    
	}
	@When("user enters valid email address {string} in the Sign In textbox")
	public void user_enters_valid_email_address_in_the_sign_in_textbox(String email) {
		a1.getEmailField().sendKeys(email);
	    
	}
	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		a1.getContinueBtn().click();
	    
	}
	@When("User enters valid password {string} in Password textbox")
	public void user_enters_valid_password_in_password_textbox(String pass) {
		a1.getPasswordField().sendKeys(pass);
	    
	}
	@When("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		a1.getSignInBtn().click();
	    
	}
	@When("User clicks on the address checkbox")
	public void user_clicks_on_the_address_checkbox() {
		a1.getSelectAddress().click();
	    
	}
	@When("User clicks on Use this address button")
	public void user_clicks_on_use_this_address_button() {
		a1.getUseAddressBtn().click();
	   
	}
	@Then("User takes screenshot of the page")
	public void user_takes_screenshot_of_the_page() throws IOException {
		Screenshot();
	   
	}

}
