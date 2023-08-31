package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_DeleteRequest 
{
	@Test
	public void testCase5() throws IOException
	{
		Properties pr= PropertiesHandle.loadPropertiesFile("../ApiFramework/URI.properties");
		HTTTPMethods http= new HTTTPMethods(pr);
		Response res= http.deletemethod("URI_2", TC1_PostRequest.returnidValue);
		validateResponse.validateStatusCode(200, res);
	}

}
