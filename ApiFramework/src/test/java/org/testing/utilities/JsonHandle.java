package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

//input parameter-- json file path
//purpose of method-- to load json file
//output--- json data in string format
public class JsonHandle 
{
	public static String loadJsonFile(String filepath) throws FileNotFoundException
	{
	File f= new File(filepath);
	FileInputStream fi= new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONObject j= new JSONObject(js);
	return j.toString();
	}

}
