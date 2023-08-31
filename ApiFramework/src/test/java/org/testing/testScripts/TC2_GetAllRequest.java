package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetAllRequest 
{
	@Test
	public void testcase2() throws IOException
	{

		Properties pr= PropertiesHandle.loadPropertiesFile("../ApiFramework/URI.properties");
		HTTTPMethods http= new HTTTPMethods(pr);
		Response res= http.getmethod("URI_2");
		validateResponse.validateStatusCode(200, res);
		JsonParsingUsingOrgJson.JsonParse(res.asString(), "id");
	}
	
}
