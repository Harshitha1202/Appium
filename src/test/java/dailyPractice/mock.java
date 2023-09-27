package dailyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mock {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/rankings-predictor/test");
		Actions act = new Actions(driver); 
//		act.moveToElement(driver.findElement(By.xpath("//div[text()='Show Predicted Ranking Table	']")));
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://9282652.fls.doubleclick.net/activityi;src=9282652;type=iccre0;cat=iccwe0;u1=[user_language];u2=[user_country];u3=[page_type];u4=[web_domain];dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;tfua=;npa=;ord=[SessionID]?']"));
//		driver.switchTo().frame(iframe);
		WebElement e1 = driver.findElement(By.xpath("//div[@data-match-type='TEST']/div[@data-match-id='102968']/descendant::div[@data-team='team1']/descendant::a[@class='btn up']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@data-match-id='102968']/descendant::div[@data-team='team2']/descendant::a[@class='btn up']"));
    	act.moveToElement(e1).click().perform();
    	act.moveToElement(e2).click().perform();
		String Ranking = driver.findElement(By.xpath("//tbody/tr/td[3]")).getText();
		
		System.out.println(Ranking);
		
	}


}
