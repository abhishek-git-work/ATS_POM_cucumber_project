package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class validProductPage {

	WebDriver driver;
	
	public validProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='bgnone']")
	private WebElement validProductDisplayMssg;
	
	public String validProductDisplayMssg()
	{
		String mssg = validProductDisplayMssg.getText();
		return mssg;
	}
	
}
