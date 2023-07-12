package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import Pages.RegistrationSuccessPage;
import factory.driverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utils.TimeStamp;

public class Register extends driverFactory{
	
	HomePage hp;
	LoginPage lp;
	RegistrationPage rp;
	RegistrationSuccessPage rsp;
	
	@Given("user navigates to registration page")
	public void user_navigates_to_registration_page() {
	   
		hp = new HomePage(driver); 
		hp.clickOnLoginOrRegisterTab();
		
		lp = new LoginPage(driver);
		lp.ContinueToRegistrationButton();
	}

	@When("user enters below details into respective fields")
	public void user_enters_below_details_into_respective_fields(DataTable dataTable) {
	    
		rp =new RegistrationPage(driver);
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		
		rp.firstnameTextField(dataMap.get("firstname"));
		rp.lastNameTextField(dataMap.get("lastname"));
		rp.AccountFrm_emailTextField(TimeStamp.emailWithTimeStamp());
		rp.telephoneTextField(dataMap.get("telephone"));
		rp.faxTextField(dataMap.get("fax"));
		rp.companyTextField(dataMap.get("company"));
		rp.address_1TextField(dataMap.get("address1"));
		rp.address_2TextField(dataMap.get("address2"));
		rp.cityNameTextField(dataMap.get("city"));
		rp.postcodeTextField(dataMap.get("zipcode"));
		rp.accountLoginNameTextField(TimeStamp.loginNameWithTimeStamp());
		rp.passwordTextField(dataMap.get("password"));
		rp.passwordConfirmTextField(dataMap.get("password"));
		
	}

	@When("user enters below details into respective fields with duplicate login name")
	public void user_enters_below_details_into_respective_fields_with_duplicate_login_name(DataTable dataTable) {
	    
		rp =new RegistrationPage(driver);
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		
		rp.firstnameTextField(dataMap.get("firstname"));
		rp.lastNameTextField(dataMap.get("lastname"));
		rp.AccountFrm_emailTextField(TimeStamp.emailWithTimeStamp());
		rp.telephoneTextField(dataMap.get("telephone"));
		rp.faxTextField(dataMap.get("fax"));
		rp.companyTextField(dataMap.get("company"));
		rp.address_1TextField(dataMap.get("address1"));
		rp.address_2TextField(dataMap.get("address2"));
		rp.cityNameTextField(dataMap.get("city"));
		rp.postcodeTextField(dataMap.get("zipcode"));
		rp.accountLoginNameTextField(dataMap.get("loginName"));
		rp.passwordTextField(dataMap.get("password"));
		rp.passwordConfirmTextField(dataMap.get("password"));
	}
	
	@And("clicks on respective country")
	public void clicks_on_respective_country() {
	    
		rp =new RegistrationPage(driver);
		WebElement x = rp.clickOnCountry();
		Select s = new Select(x);
		s.selectByVisibleText("India");
	}

	@And("clicks on respective state")
	public void clicks_on_respective_state() {
	  
		WebElement y = rp.clickOnState();
		Select s = new Select(y);
		s.selectByVisibleText("Maharashtra");	
	}

	@And("clicks on yes for subscribe")
	public void clicks_on_yes_for_subscribe() {
	   
		rp.clickOnSubscribe();
	}

	@And("agrees to privacy policy")
	public void agrees_to_privacy_policy() {
	 
		rp.clickOnPrivacyPolicy();
	}
	
	@And("clicks on continue button")
	public void clicks_on_continue_button() {
	 
		rp.clickOnContButton();
	}

	@Then("new user account should be created")
	public void new_user_account_should_be_created() {
	  
		rsp = new RegistrationSuccessPage(driver);
		Assert.assertEquals("Congratulations! Your new account has been successfully created!",rsp.accountSuccessMssg());
	}

	@Then("proper warning message gets displayed")
	public void proper_warning_message_gets_displayed() {
	    
		rp =new RegistrationPage(driver);
		Assert.assertEquals("×\n"+"This login name is not available. Try different login name!",rp.duplicateLoginNameWarningMssg());

	}
	
}
