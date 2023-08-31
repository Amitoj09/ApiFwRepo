package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

//input parametere---RequestBody, uri value from properties file
public class HTTTPMethods 
{
	Properties pr;
	public HTTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response postmethod(String requestBody, String uriKeyname)
	{
		String urivalue= pr.getProperty(uriKeyname);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(urivalue);
		System.out.println("status code is");
		System.out.println(res.statusCode());
		System.out.println("response is");
		System.out.println(res.asString());
		
		return res;
	}
	
	public Response getmethod(String uriKeyname)
	{
		String urivalue= pr.getProperty(uriKeyname);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		System.out.println("status code is");
		System.out.println(res.statusCode());
		System.out.println("response is");
		System.out.println(res.asString());
		
		return res;
	}
	
	public Response getparticularmethod(String uriKeyname, String endPoint)
	{
		String urivalue= pr.getProperty(uriKeyname)+"/"+endPoint;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		System.out.println("status code is");
		System.out.println(res.statusCode());
		System.out.println("response is");
		System.out.println(res.asString());
		
		return res;
	}
	
	public Response putmethod(String requestBody, String uriKeyname, String endPoint)
	{
		String urivalue= pr.getProperty(uriKeyname)+"/"+endPoint;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.put(urivalue);
		System.out.println("status code is");
		System.out.println(res.statusCode());
		System.out.println("response is");
		System.out.println(res.asString());
		
		return res;
	}
	
	public Response deletemethod(String uriKeyname, String endPoint)
	{
		String urivalue= pr.getProperty(uriKeyname)+"/"+endPoint;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(urivalue);
		System.out.println("status code is");
		System.out.println(res.statusCode());
		System.out.println("response is");
		System.out.println(res.asString());
		
		return res;
	}
}
