package org.mpasis.automation.uo.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator
{

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		//Object[] data = {"user1","pass1"};  //1-d array
		Object[][] data1 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //1-d array
		return data1;
	}

	@DataProvider(name="staticdata1")
	public Object[][] testdata1()
	{
		//Object[] data = {"user1","pass1"};  //1-d array
		Object[][] data1 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //1-d array
		return data1;
	}
	
}

