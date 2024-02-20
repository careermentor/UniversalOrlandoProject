package org.mpasis.automation.uo.testcases;

import org.mpasis.automation.uo.baseClasspkg.InitiateBrowser;
import org.mpasis.automation.uo.pages.SignInPage;
import org.testng.annotations.Test;

public class SignInScenario2 extends InitiateBrowser
{

	@Test
	public void validate_signin_func() throws Exception
	{
		SignInPage sign = new SignInPage(driver);
		sign.click_menulink();
		sign.click_Signlink_Menu();
		sign.enter_username("modisantosh@gmail.com");
		sign.enter_password("pass1234");
		sign.click_SignInBttn();
	}
	
}
