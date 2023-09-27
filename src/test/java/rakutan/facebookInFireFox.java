package rakutan;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.base;

public class facebookInFireFox extends base{
	@Test
	public void test()
	{
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}

}
