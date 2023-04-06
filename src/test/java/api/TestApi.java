package api;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;

public class TestApi {

	public static void main(String[] args, ResponseOptions<Response> res) {
		Payload pay = new Payload();
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(pay.locatioPayload()).when().post("/maps/api/place/add/json");
		//.then().log().all().assertThat().statusCode(200);
		int statusCode = res.statusCode();
		Assert.assertEquals(statusCode,200);
		long time= res.getTime();
		Headers header =res.headers();
		

	}

}

