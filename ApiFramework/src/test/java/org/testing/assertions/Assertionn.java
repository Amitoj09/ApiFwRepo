package org.testing.assertions;

import io.restassured.response.Response;

public class Assertionn 
{
	public static Boolean assert1(int expectedStatusCode, Response res)
	{
		if(expectedStatusCode==res.statusCode())
		{
			System.out.println("Staus Code is matching");
			return true;
		}
		else
		{
			System.out.println("Staus Code is not matching");
			return false;
		}
	}
	
	public static Boolean assert1(String expectedValue, String actualValue)
	{
		if(expectedValue.equals(actualValue))
		{
			System.out.println("data is matching");
			return true;
		}
		else
		{
			System.out.println("Data is not matching");
			return false;
		}
	}
}
