package org.mpasis.automation.uo.utilitiesClasspkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{
	
	public static void testResult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //take screenshot /prt sc
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResult/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
	
}
