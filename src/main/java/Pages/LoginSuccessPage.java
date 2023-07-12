package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage {
	
WebDriver driver;
	
	public LoginSuccessPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body//div//div//div//div//div//h1//span[contains(text(),'My Account')]")
	private WebElement loginSuccessConfirmation;
	
	public String loginSuccessConfirmation()
	{
		String loginSuccText = loginSuccessConfirmation.getText();
		return loginSuccText;
	}

}
