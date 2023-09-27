package rakutan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions 
{
	@Test
	public void test() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try
		{
			driver.findElement(By.xpath("//button[.='✕']")).click();
		}
		finally {
		driver.findElement(By.name("q")).sendKeys("samsung s20");
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO' and contains(.,'samsung s20')]"));
		int count=allSugg.size();
		for(int i=0;i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
			if(text.equals("samsung s20")) {
				allSugg.get(i).click();
				break;
			}
		}
		//driver.quit();
		}
	}
}


