package utility;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class TestCasesAPI {
	
	@Test
	public void test1() {
		JsonPath json = new JsonPath(utility.GetCompleteDetailsJson());
		
		int courseCount = json.getInt("courses.size()");
		
		Assert.assertEquals(courseCount, 3);
		
		int sum = 0;
		for(int i=0;i<courseCount;i++) {
			int price = json.getInt("courses["+ i +"].price");
			int copy = json.getInt("courses["+ i +"].copies");
			
			sum = sum + price*copy;
		}
		
		Assert.assertEquals(sum,910);
		
	}
	
	@Test
	public void test2() {
		JsonPath json = new JsonPath(utility.GetCompleteDetailsJson());
		
		int courseCount = json.getInt("courses.size()");
		
		int sum = 0;
		for(int i=0;i<courseCount;i++) {
			int price = json.getInt("courses["+ i +"].price");
			int copy = json.getInt("courses["+ i +"].copies");
			
			sum = sum + price*copy;
		}
		
		Assert.assertEquals(sum,910);
		
	}

}
