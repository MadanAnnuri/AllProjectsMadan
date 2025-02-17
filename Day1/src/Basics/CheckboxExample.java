package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/v-madanmohan/Downloads/amol.html");
        WebElement java=driver.findElement(By.id("check0"));
        WebElement selenium=driver.findElement(By.id("check1"));
        WebElement cucumber=driver.findElement(By.id("check2"));

        if(java.isSelected())
            java.click();
        if(selenium.isSelected())
            selenium.click();
        if(cucumber.isSelected())
            cucumber.click();
    }
}
