package gmail_gluecode;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmail_page.Gmail_homepage;


public class Gluecode 
{
	public WebDriverWait wait;
	public ChromeDriver driver;
	public Properties pr;
	public Scenario ss;
	public Gmail_homepage ghp;

@Before
public void method(Scenario s) throws Exception
{
	this.ss=s;
	FileInputStream fis=new FileInputStream("D:\\cucmber\\cucmber\\src\\test\\resources\\repository\\file.properties");
	pr=new Properties();
	pr.load(fis);
}
 @Given ("^launch site$")
	public void method2() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\bindu\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	      driver.get("https://www.gmail.com");
	      ghp=new Gmail_homepage(driver);
	      wait=new WebDriverWait(driver,40 );
	      wait.until(ExpectedConditions.visibilityOf(ghp.userid));
	}
	@When ("^user id page is displayed$")
	public void method3()
	{
		if(ghp.userid.isDisplayed())
		{
			ss.write("User id test passed");
		}
		ghp.uerid();
	}
	@Then ("^Validate Title \"(.*)\" will be displayed$") 
	public void method4(String x)
	{
		
		String title=driver.getTitle();
		if(title.contains(x))
		{
			ss.write("Title Test Passed");
		}
		else
		{
			ss.write("Title test failed");
		}
	}
	
	@When ("^close site$")
	public void method5() 
	{
		driver.close();
	}	

}
