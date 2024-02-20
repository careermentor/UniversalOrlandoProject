package org.mpasis.automation.uo.testcases;

import org.mpasis.automation.uo.baseClasspkg.InitiateBrowser;
import org.mpasis.automation.uo.dataGenerator.TestDataGenerator;
import org.mpasis.automation.uo.pages.SignInPage;
import org.testng.annotations.Test;

public class SignInScenario_ddf extends InitiateBrowser
{

	@Test(dataProvider="staticdata1", dataProviderClass=TestDataGenerator.class)
	public void validate_signin_func(String username, String password) throws Exception
	{
		SignInPage sign = new SignInPage(driver);
		sign.click_menulink();
		sign.click_Signlink_Menu();
		sign.enter_username(username);
		sign.enter_password(password);
		sign.click_SignInBttn();
	}
	
	
	
	
}
