package rakutan;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getAPi
{
	@Test
	public void test()
	{
		 basePath="https://api.publicapis.org/";
	
		 when().get("entries")
		 .then().log().all();
	}

}
