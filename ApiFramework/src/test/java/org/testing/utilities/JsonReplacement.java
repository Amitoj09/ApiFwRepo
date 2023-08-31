package org.testing.utilities;

import java.util.regex.Pattern;

//input paramete-- requestbody, variablename, variable value
public class JsonReplacement 
{
	public static String assignVariableValue(String requestBody, String variableName, String variableValue)
	{
		requestBody=requestBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return requestBody;
		
	}

}
