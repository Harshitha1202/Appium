package rakutan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.base;
import generic.robotClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class framework extends base
{
//	@Test
//	public void test() throws AWTException
//	{
//				WebDriverManager.chromedriver().setup();
//				WebDriver driver= new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				driver.get("https://www.google.com");
//				Robot r= new Robot();
//				r.keyPress(KeyEvent.VK_CONTROL);
//				r.keyPress(KeyEvent.VK_T);
//				r.keyRelease(KeyEvent.VK_CONTROL);
//				r.keyRelease(KeyEvent.VK_T);
//				String pw = driver.getWindowHandle();
//				Set<String> win = driver.getWindowHandles();
//				for (String allwin : win) 
//				{
//					if(!allwin.equals(pw))
//					{
//						driver.switchTo().window(allwin);
//					}
//				}
//				driver.get("https://www.facebook.com");
//	}
	
	@Test
	public void test2() throws AWTException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		robotClass ro= new robotClass(driver);
		ro.switchTab();
		String pw = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		for (String allwin : win) 
		{
			if(!allwin.equals(pw))
			{
				driver.switchTo().window(allwin);
			}
		}
		driver.get("https://www.facebook.com");
	}
	
}
