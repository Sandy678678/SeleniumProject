package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLoginStepDefinition {

	WebDriver driver;

	@Given("User launches Facebook url")
	public void user_launches_facebook_url() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("User enters invalid username")
	public void user_enters_invalid_username() {
		driver.findElement(By.id("email")).sendKeys("Hello Hello");

	}

	@When("User enters invalid password")
	public void user_enters_invalid_password() {
		driver.findElement(By.id("pass")).sendKeys("Bye");

	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();

	}

	@Then("User captures the error message")
	public void user_captures_the_error_message() {
		WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'The password that')]"));
		System.out.println(errorMsg.getText());

	}

}
