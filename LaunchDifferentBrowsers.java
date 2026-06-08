package com.TestNGDemoTest;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class LaunchDifferentBrowsers {
	
	
	@Test(priority=0)
	public void EdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
	}
}