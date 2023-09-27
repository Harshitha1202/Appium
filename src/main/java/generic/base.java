package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base 
{
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public WebDriver beforeClass(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
	return driver;
	}	
	@AfterMethod
	public void afterClass()
	{
		//driver.quit();
	}
}