package org.testing.responseValidation;

import org.testing.assertions.Assertionn;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testng.Assert;

import io.restassured.response.Response;

public class validateResponse
{
	public static void validateStatusCode(int expectedStatusCode, Response res)
	{
		//Assert.assertEquals(res.statusCode(), expectedStatusCode, "Status code is not matching");
		//System.out.println("Status code is matching");
		Boolean response= Assertionn.assert1(expectedStatusCode, res);
		Assert.assertTrue(response);
	}
	public static void validateResponseData(String expectedData, Response res, String jsonPath)
	{
		String actualValue= JsonParsingUsingJsonPath.jsonparse(res, jsonPath);
		Boolean response= Assertionn.assert1(expectedData, actualValue);
		Assert.assertTrue(response);
	}
}
