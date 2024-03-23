package com.myprojectstructure.SeleniumLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumLab09 {
    public static void main(String[] args) throws MalformedURLException {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com"); //  // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }

    public static class Lab02 {
        //Switch to a specific window out of 100 windows and validate it

        public static void main(String[] args) {


            WebDriver driver = new ChromeDriver();
            driver.get("https://www.w3schools.com/icons/");
            driver.findElement(By.xpath("//span[contains(@class,\"fa fa-youtube \")]")).click();
            driver.findElement(By.xpath("//span[contains(@class,\"fa fa-linkedin\")]")).click();
            driver.findElement(By.xpath("//span[contains(@class,\"fa fa-facebook\")]")).click();
            driver.findElement(By.xpath("//span[contains(@class,\"fa fa-instagram \")]")).click();


        }

    }
}

