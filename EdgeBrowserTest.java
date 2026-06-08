package com.SeleniumEdge.Browser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        
        //driver.quit();
	
	}

}
