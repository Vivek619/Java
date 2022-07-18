package garima_Demo_agile;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestNgWithRestAssured {

	@Test
	public void test1() {
		
		TestNgRestApiData obj = new TestNgRestApiData();
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		//given, when, then
		
		String response = given().header("Content-Type", "application/json")
		.body(obj.GetBookData())
		.when().post("Library/Addbook.php")
		.then().log().all().statusCode(200)
		.extract().response().asString()
		;
		
		JsonPath json = new JsonPath(response);
		
		String id = json.getString("ID");
		Assert.assertEquals(id, "xcd195");
		
	}
	
	@Test
	public void test2() throws IOException {
		
		TestNgRestApiData obj = new TestNgRestApiData();
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		//given, when, then
		System.out.println(new String(Files.readAllBytes(Paths.get("C:\\Users\\TiaaUser\\OneDrive\\Desktop\\BooksData.json"))));
		
		String response = given().log().all().header("Content-Type", "application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\TiaaUser\\OneDrive\\Desktop\\BooksData.json"))))
		.when().post("Library/Addbook.php")
		.then().log().all().statusCode(200)
		.extract().response().asString()
		;
		
		JsonPath json = new JsonPath(response);
		
		String id = json.getString("ID");
		Assert.assertEquals(id, "xit450");
		
	}
	
	
}
