package org.mpasis.automation.uo.baseClasspkg;

import java.time.Duration;

import org.mpasis.automation.uo.utilitiesClasspkg.ReadPropFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFile.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFile.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFile.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebDriverManager.chromedriver().setup();
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
