package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://Google.com");
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}

