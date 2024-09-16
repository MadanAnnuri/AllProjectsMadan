package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/v-madanmohan/Downloads/amol.html");

       WebElement drpSel= driver.findElement(By.id("seltext"));

       //Create an object of select class
       Select sel =new Select(drpSel);

       //sel.selectByIndex(4);
       // sel.selectByVisibleText(" text 3");
        sel.selectByValue("v13");


    }
}