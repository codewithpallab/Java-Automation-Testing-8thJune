package com.SeleniumServer.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

    @Test(priority = 0)
    public void openOrangeHRM() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened OrangeHRM");
    }

    @Test(priority = 1)
    public void openOpenCart() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened OpenCart");
    }

    @Test(priority = 2)
    public void openBing() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.bing.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened Bing");
    }

    @Test(priority = 3)
    public void openFreeCRM() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.freecrm.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened FreeCRM");
    }

    @Test(priority = 4)
    public void openEbay() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.chase.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened chase");
    }

    @Test(priority = 5)
    public void openAltoro() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://altoro.testfire.net/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened Altoro");
    }


    @Test(priority = 6)
    public void openPracticeAutomation() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened Practice Test Automation");
    }

    @Test(priority = 7)
    public void openBlogspot() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened Blogspot Test Site");
    }

    @Test(priority = 8)
    public void openDemoBlaze() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String Pagesource = driver.getPageSource();
        System.out.println(Pagesource);
        System.out.println("Opened DemoBlaze");
    }
}