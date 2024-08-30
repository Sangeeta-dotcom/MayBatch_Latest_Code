package ApiAutomation.ApiAuto;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetMethod 
{
	public static void main(String[] args) 
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("https://reqres.in/api/users/2");
		
		System.out.println("status code is ");
		System.out.println(res.statusCode());
		
		System.out.println("response data is ");
		System.out.println(res.asString());
		

}
}
