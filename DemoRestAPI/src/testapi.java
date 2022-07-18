import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testapi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Rest Assured
		//given (input is given here -> query params, URL, header, body)
		//when -> request is hit
		//then -> response is checked here
//		System.out.println(new String(Files.readAllBytes(Paths.get("C:\\Users\\TiaaUser\\OneDrive\\Desktop\\BooksData.json"))));
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String jsonResponse = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}")
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString()
		;
		
		JsonPath json = new JsonPath(jsonResponse);
		String place_id = json.get("place_id");
		System.out.println(place_id);
		
		
		given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", place_id)
		.header("Content-Type","application/json")
		.when().get("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200);
		
		
		
	}

}
