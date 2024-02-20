package org.mpasis.automation.uo.pages;

import org.mpasis.automation.uo.utilitiesClasspkg.ReadPropFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage2 
{
	
	WebDriver driver; 

	public SignInPage2(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_menulink() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelemet("UO_home_menu_css"))).click();
	}
	
	public void click_Signlink_Menu() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelemet("UO_Menu_Signin_xpath"))).click();
	}
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelemet("UO_SignIn_username_name"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelemet("UO_SignIn__password_name"))).sendKeys(pass);
	}
	
	public void click_SignInBttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelemet("UO_SignIn_signinbuttn_name"))).click();
	}
}
