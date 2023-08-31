package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest 
{
	@Test
	public void testCase4() throws IOException
	{
		Properties pr= PropertiesHandle.loadPropertiesFile("../ApiFramework/URI.properties");
		String requestBody=JsonHandle.loadJsonFile("../ApiFramework/src/test/java/org/testing/resources/UpdateRequestPayload.json");
		
		requestBody= JsonReplacement.assignVariableValue(requestBody, "id", TC1_PostRequest.returnidValue);
		HTTTPMethods http= new HTTTPMethods(pr);
		Response res= http.putmethod(requestBody, "URI_2",TC1_PostRequest.returnidValue);
		validateResponse.validateStatusCode(200, res);
		
	}

}
