package rakutan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	@Test
	public void running() throws InterruptedException, AWTException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		//String pw = driver.getWindowHandle();
		WebElement song = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		song.sendKeys("song");
		//Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class=\"sbqs_c\" and contains(.,'song')]"));
		int count = allSugg.size();
		for(int i=0;i<allSugg.size();i++)
		{
			String text = allSugg.get(i).getText();
			System.out.print(text);

			if(text.contains("new"))
			{
				allSugg.get(i).click();
				break;
			}
		}
		// driver.quit();
	}
}


