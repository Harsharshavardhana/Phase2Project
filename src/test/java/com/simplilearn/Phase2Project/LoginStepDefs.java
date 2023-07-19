package com.simplilearn.Phase2Project;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefs {
WebDriver driver = Hookes.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() 
	{
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.get("https://www.saucedemo.com/");
	}

	//@Given("I have clicked on Login Link")
	//public void i_have_clicked_on_Login_Link()
	//{
	    // Write code here that turns the phrase above into concrete actions
	   
	//	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	//	loginLink.click();
	//}

	@When("I enter username")
	public void i_enter_username()
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.sendKeys("standard_user");
	}

	@When("I enter password")
	public void i_enter_password() 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginBtn.click();
	}

	@Then("I should land on home page with welcome message")
	public void i_should_land_on_home_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
		String ActError1 = error.getText();
		String ExpError1 = "Products";
		Assert.assertEquals(ActError1, ExpError1); 
	}

   @When("I enter username as {string}")
	public void i_enter_username_as(String UserNameVal)
   {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.sendKeys(UserNameVal);
	   
	}
   
	@When("I enter password as {string}")
	public void i_enter_password_as(String PassVal) 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(PassVal);
	   
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpError)
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.id("login_button_container"));
		String ActError = error.getText();
		
		Assert.assertEquals(ActError, ExpError);  
	}
	
	@When("Login is ok take product  put it cart product name is Sauce Labs Backpack")
	public void add_Sauce_Labs_Backpack_to_cart() 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement cartProduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		cartProduct.click();
	   
	}
	
	@When("I should click cart button")
	public void Click_cart() 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement cartProduct = driver.findElement(By.id("shopping_cart_container"));
		cartProduct.click();
	   
	}
	
	@Then("Check product is avaible in cart")
	public void verify_cart_product_correct() 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement cartProduct_vrf = driver.findElement(By.id("item_4_title_link"));
		String verify_cart_produce = cartProduct_vrf.getText();
		String product_name ="Sauce Labs Backpack";
		Assert.assertEquals(verify_cart_produce, product_name);
	}

}
