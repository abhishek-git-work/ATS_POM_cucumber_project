package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSuccessPage {

	WebDriver driver;
	
	public RegistrationSuccessPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'Congratulations! Your new account has been success')]")
	private WebElement accountSuccessMssg;
	
	public String accountSuccessMssg()
	{
		String accSuccMssg = accountSuccessMssg.getText();
		return accSuccMssg;
	}
}
