package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='filter_keyword']")
	private WebElement validProductText;
	
	public void enterValidProduct(String validProduct)
	{
		validProductText.sendKeys(validProduct);
	}
	
	@FindBy(xpath="//input[@id='filter_keyword']")
	private WebElement invalidProductText;
	
	public void enterInValidProduct(String invalidProduct)
	{
		invalidProductText.sendKeys(invalidProduct);
	}
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement clickOnSearchButton;
	
	public void clickOnSearchButton()
	{
		clickOnSearchButton.click();;
	}
	
	@FindBy(linkText="Login or register")
	private WebElement clickOnLoginOrRegisterTab;
	
	public void clickOnLoginOrRegisterTab()
	{
		clickOnLoginOrRegisterTab.click();;
	}
	
	
	
	
}
