package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageDropDown {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dropdown");

       WebElement drpdwn= driver.findElement(By.id("country"));
       Select drpsel=new Select(drpdwn);
       drpsel.selectByValue("AL");


       //driver.close();
      // driver.quit();





    }
}
