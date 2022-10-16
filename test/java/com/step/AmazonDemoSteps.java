package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemoSteps {
	
	WebDriver driver;
	
	@Given("User launch Amazon home page")
	public void user_launch_amazon_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    
	}
	@When("User captures page title")
	public void user_captures_page_title() {
		System.out.println(driver.getCurrentUrl());    
	}
	
	@When("User clicks on Mobiles tab")
	public void user_clicks_on_mobiles_tab() {
	    driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

}
