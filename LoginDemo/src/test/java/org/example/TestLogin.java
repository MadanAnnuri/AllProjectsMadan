package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.security.PublicKey;


public class TestLogin {

    @Test
    public Void TestLogin() {
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.name("username")).sendKeys("tomsmith");

        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();


        driver.close();


    }
}
