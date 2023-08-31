package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.*;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	static String returnidValue;
	@Test
	public void testcase1() throws IOException 
	{
		Properties pr= PropertiesHandle.loadPropertiesFile("../ApiFramework/URI.properties");
		String requestBody=JsonHandle.loadJsonFile("../ApiFramework/src/test/java/org/testing/resources/RequestPayload.json");
		Random r= new Random();
		Integer idValue= r.nextInt();
		requestBody= JsonReplacement.assignVariableValue(requestBody, "id", idValue.toString());
		HTTTPMethods http= new HTTTPMethods(pr);
		Response res= http.postmethod(requestBody, "URI_2");
		validateResponse.validateStatusCode(201, res);
		
		returnidValue=JsonParsingUsingOrgJson.JsonParse(res.asString(), "id");
		
	}
}
