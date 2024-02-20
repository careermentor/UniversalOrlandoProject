package org.mpasis.automation.uo.utilitiesClasspkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelemet(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.getProperty(key);
	}
	
}
