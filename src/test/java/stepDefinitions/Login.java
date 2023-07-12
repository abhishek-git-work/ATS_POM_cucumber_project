package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.LoginSuccessPage;
import factory.driverFactory;
import io.cucumber.java.en.*;


public class Login extends driverFactory{

	HomePage hp;
	LoginPage lp;
	LoginSuccessPage lsp;
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
	    
		hp = new HomePage(driver); 
		hp.clickOnLoginOrRegisterTab();
	}

	@When("^user enters valid login name (.+) into login name field$")
	public void user_enters_valid_login_name_into_login_name_field(String validLoginNameText) {
	   
		lp = new LoginPage(driver);
		lp.LoginNameTextField(validLoginNameText);
	}

	@And("^user enters valid password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String validPasswordText) {
	   
		lp.PasswordTextField(validPasswordText);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	   
		lp = new LoginPage(driver);
		lp.clickOnLoginButton();
	}

	@Then("user gets login successfully")
	public void user_gets_login_successfully() {
	   
		lsp = new LoginSuccessPage(driver);
		Assert.assertEquals("MY ACCOUNT", lsp.loginSuccessConfirmation());
	}

	@When("user enters invalid login name {string} into login name field")
	public void user_enters_invalid_login_name_into_login_name_field(String invalidLoginNameText) {
	  
		lp = new LoginPage(driver);
		lp.LoginNameTextField(invalidLoginNameText);
	}

	@And("user enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
	    
		lp = new LoginPage(driver);
		lp.PasswordTextField(invalidPasswordText);
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
	    
		lp = new LoginPage(driver);
		Assert.assertEquals("×\n"+"Error: Incorrect login or password provided.", lp.loginFaliedWarningMssg());
	}
	
}
