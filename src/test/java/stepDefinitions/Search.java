package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.invalidProductPage;
import Pages.validProductPage;
import factory.driverFactory;
import io.cucumber.java.en.*;

public class Search extends driverFactory{
	
	HomePage hp;
	validProductPage vpp;
	invalidProductPage ivpp;
	
	@Given("user opens the application")
	public void user_opens_the_application() {
//	    blank
	}

	@When("user enters valid product {string} into Seach box field")
	public void user_enters_valid_product_into_seach_box_field(String validProduct) {
		
		hp = new HomePage(driver);    
		hp.enterValidProduct(validProduct);
	}

	@Then("user should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
	    
		vpp = new validProductPage(driver);
		Assert.assertEquals("Womens high heel point toe stiletto sandals ankle strap court shoes",vpp.validProductDisplayMssg());
	}

	@When("user enters invalid product {string} into Seach box field")
	public void user_enters_invalid_product_into_seach_box_field(String invalidProduct) {
	    
		hp = new HomePage(driver); 
		hp.enterInValidProduct(invalidProduct);  
	}

	@Then("user should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	    
		ivpp = new invalidProductPage(driver);
		Assert.assertEquals("There is no product that matches the search criteria.", ivpp.invalidProductDisplayMssg());
	}

	@And("user clicks on Search button")
	public void user_clicks_on_search_button() {
	   
		hp = new HomePage(driver); 
		hp.clickOnSearchButton();
	}
	
}
