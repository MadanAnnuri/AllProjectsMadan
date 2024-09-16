package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/v-madanmohan/Downloads/amol.html");
        WebElement mul=driver.findElement(By.id("multiSel"));

        Select mulSel=new Select(mul);

        mulSel.selectByIndex(0);
        mulSel.selectByVisibleText(" text 5");


        //mulSel.deselectByIndex(0);
        mulSel.deselectAll();


    }
}
