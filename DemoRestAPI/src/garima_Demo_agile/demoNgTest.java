package garima_Demo_agile;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class demoNgTest {

	@Test
	public void test1() {
		apidata obj = new apidata();
		JsonPath json = new JsonPath(obj.GetData());
		
		int r = json.getInt("random");
		
		Assert.assertTrue(r == 12);
	}
	
	@Test
	public void test2() {
		apidata obj = new apidata();
		JsonPath json = new JsonPath(obj.GetData());
		
		float r = json.getFloat("random_float");
		
		Assert.assertTrue(r == 4.56f);
	}
	
	@Test
	public void test3() {
	apidata obj = new apidata();
	JsonPath json = new JsonPath(obj.GetData());
	String r = json.get("enum");
	Assert.assertTrue(r.equals("generator"));
	}
	
	@Test
	public void test4() {
	apidata obj = new apidata();
	JsonPath json = new JsonPath(obj.GetData());
	String r = json.getString("firstname");
	Assert.assertTrue(r.length() < 10);
	
//	Assert.assertEquals(r.length(), 8);
	}
	
	@Test
	public void test5() {
	apidata obj = new apidata();
	JsonPath json = new JsonPath(obj.GetData());
	int coursesCount = json.getInt("courses.size()");
	Assert.assertTrue(coursesCount == 2);
	}
	
	@Test
	public void test6() {
	apidata obj = new apidata();
	JsonPath json = new JsonPath(obj.GetData());
	int coursesCount = json.getInt("courses.size()");
			
    int sum = 0;
	for(int i = 0;i<coursesCount;i++) {
		int price = json.getInt("courses[" + i + "].price"); // courses[0].price
		sum = sum + price;
	}
	
	Assert.assertTrue(sum == 700);
	
	}
	
	@Test
	public void test7() {
	apidata obj = new apidata();
	JsonPath json = new JsonPath(obj.GetData());
	int coursesCount = json.getInt("courses.size()");
	
	int price = 0;
	for(int i = 0;i<coursesCount;i++) {
		String courseName = json.getString("courses[" + i + "].name"); // courses[0].price
		if (courseName.equals("Selenium")) {
			price = json.getInt("courses[" + i + "].price");
			break;
		}
	}
	
	Assert.assertEquals(price, 300);
	
	}

}
