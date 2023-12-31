package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

//input parameter---- complete response body, keyname
public class JsonParsingUsingOrgJson
{
	public static String JsonParse(String responseData, String keyName)
	{
		if(responseData.startsWith("["))
		{
			JSONArray array= new JSONArray(responseData);
		
		int L= array.length();
		for(int i=0;i<L;i++)
		{
			JSONObject ob= array.getJSONObject(i);
			System.out.println(ob.get(keyName));
		}
		return null;
		}
		else if(responseData.startsWith("{"))
		{
			JSONObject j= new JSONObject(responseData);
			String responseId= j.getString(keyName);
			return responseId;
		}
		return null;
	}

}
