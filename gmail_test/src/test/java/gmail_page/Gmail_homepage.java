package gmail_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_homepage 
{
	@FindBy (name="identifier")
	public WebElement userid;
	
	
	
	public Gmail_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void uerid()
	{
		userid.sendKeys("sudhakar241241");
	}
}
