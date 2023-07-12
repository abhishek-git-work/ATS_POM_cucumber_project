package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='loginname']")
	private WebElement LoginNameTextField;
	
	public void LoginNameTextField(String LoginNameText)
	{
		LoginNameTextField.sendKeys(LoginNameText);
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement PasswordTextField;
	
	public void PasswordTextField(String PasswordText)
	{
		PasswordTextField.sendKeys(PasswordText);
	}
	
	@FindBy(xpath="//button[@title='Login']")
	private WebElement clickOnLoginButton;
	
	public void clickOnLoginButton()
	{
		clickOnLoginButton.click();
	}
	
	@FindBy(xpath="//body/div/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement loginFaliedWarningMssg;
	
	public String loginFaliedWarningMssg()
	{
		String loginFaliedWarning = loginFaliedWarningMssg.getText();
		return loginFaliedWarning;
	}
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	private WebElement ContinueToRegistrationButton;
	
	public void ContinueToRegistrationButton()
	{
		ContinueToRegistrationButton.click();
	}
	
	
}
