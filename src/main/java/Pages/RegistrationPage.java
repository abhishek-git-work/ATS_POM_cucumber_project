package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//input[@name='loginname']")
//	private WebElement LoginNameTextField;
//	
//	public void LoginNameTextField(String LoginNameText)
//	{
//		LoginNameTextField.sendKeys(LoginNameText);
//	}
	
	@FindBy(xpath="//select[@id='AccountFrm_country_id']")
	private WebElement clickOnCountry;
	
	public WebElement clickOnCountry()
	{
		clickOnCountry.click();
		return clickOnCountry;
	}
	
	@FindBy(xpath="//select[@id='AccountFrm_zone_id']")
	private WebElement clickOnState;
	
	public WebElement clickOnState()
	{
		clickOnState.click();
		return clickOnState; 
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_newsletter1']")
	private WebElement clickOnSubscribe;
	
	public void clickOnSubscribe()
	{
		clickOnSubscribe.click();
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_agree']")
	private WebElement clickOnPrivacyPolicy;
	
	public void clickOnPrivacyPolicy()
	{
		clickOnPrivacyPolicy.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	private WebElement clickOnContButton;
	
	public void clickOnContButton()
	{
		clickOnContButton.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-error alert-danger']")
	private WebElement duplicateLoginNameWarningMssg;
	
	public String duplicateLoginNameWarningMssg()
	{
		String loginDuplicateMssg = duplicateLoginNameWarningMssg.getText();
		return loginDuplicateMssg;
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextField;
	
	public void firstnameTextField(String firstnameText)
	{
		firstnameTextField.sendKeys(firstnameText);
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	public void lastNameTextField(String lastNameText)
	{
		lastNameTextField.sendKeys(lastNameText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_email']")
	private WebElement AccountFrm_emailTextField;
	
	public void AccountFrm_emailTextField(String emailText)
	{
		AccountFrm_emailTextField.sendKeys(emailText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_telephone']")
	private WebElement telephoneTextField;
	
	public void telephoneTextField(String telephoneText)
	{
		telephoneTextField.sendKeys(telephoneText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_fax']")
	private WebElement faxTextField;
	
	public void faxTextField(String faxText)
	{
		faxTextField.sendKeys(faxText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_company']")
	private WebElement companyTextField;
	
	public void companyTextField(String companyNameText)
	{
		companyTextField.sendKeys(companyNameText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_address_1']")
	private WebElement address_1TextField;
	
	public void address_1TextField(String addss1NameText)
	{
		address_1TextField.sendKeys(addss1NameText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_address_2']")
	private WebElement address_2TextField;
	
	public void address_2TextField(String addss2NameText)
	{
		address_2TextField.sendKeys(addss2NameText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_city']")
	private WebElement cityNameTextField;
	
	public void cityNameTextField(String cityNameText)
	{
		cityNameTextField.sendKeys(cityNameText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_postcode']")
	private WebElement postcodeTextField;
	
	public void postcodeTextField(String cityNameTextText)
	{
		postcodeTextField.sendKeys(cityNameTextText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_loginname']")
	private WebElement accountLoginNameTextField;
	
	public void accountLoginNameTextField(String accountLoginNameText)
	{
		accountLoginNameTextField.sendKeys(accountLoginNameText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_password']")
	private WebElement passwordTextField;
	
	public void passwordTextField(String passwordText)
	{
		passwordTextField.sendKeys(passwordText);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_confirm']")
	private WebElement passwordConfirmTextField;
	
	public void passwordConfirmTextField(String passConfirmNameText)
	{
		passwordConfirmTextField.sendKeys(passConfirmNameText);
	}
	
}
