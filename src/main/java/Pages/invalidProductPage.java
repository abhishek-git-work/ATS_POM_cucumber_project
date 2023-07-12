package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invalidProductPage {

WebDriver driver;
	
	public invalidProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'There is no product that matches the search criter')]")
	private WebElement invalidProductDisplayMssg;
	
	public String invalidProductDisplayMssg()
	{
		String mssg = invalidProductDisplayMssg.getText();
		return mssg;
	}
}
