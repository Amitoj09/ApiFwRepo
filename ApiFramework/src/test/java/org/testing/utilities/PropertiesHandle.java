package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//input parameter-- filepath
public class PropertiesHandle 
{
public static Properties loadPropertiesFile(String filepath) throws IOException
{
	File f= new File(filepath);
	FileInputStream fi= new FileInputStream(f);
	Properties pr= new Properties();
	pr.load(fi);
	return pr;
}
}
