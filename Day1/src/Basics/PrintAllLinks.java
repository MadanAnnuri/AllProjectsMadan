package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinks {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
       List<WebElement> linkList=driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());

        /*for (int i=1;i<linkList.size();i++){
            System.out.println(linkList.get(i).getText());
        }*/

        for(WebElement wb:linkList)
            System.out.println(wb.getText());
    }
}
