package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("tomsmith");

        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("SuperSecretPassword!");

        WebElement submit = driver.findElement(By.className("radius"));
        submit.click();

    }
}
