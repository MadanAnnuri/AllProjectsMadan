package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassnameTagnameExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");
       List<WebElement> wbList=driver.findElements(By.tagName("input"));
        System.out.println(wbList.size());
        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");




       /* driver.get("https://demo.opencart.com/admin/");
        List<WebElement> buttons= driver.findElements(By.className("form-control"));

        System.out.println("Size"+ buttons.size());
        buttons.get(0).sendKeys("demo");
        buttons.get(1).sendKeys("demo");*/

    }
}
