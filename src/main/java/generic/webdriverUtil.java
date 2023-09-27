package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class webdriverUtil 
{
	public WebDriver driver;

	public void maxWindow()
	{
		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver, long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void getUrl(String url)
	{
		driver.get(url);
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
}
