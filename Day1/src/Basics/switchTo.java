package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class switchTo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.naukri.com/");

        List<String> winodows= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(winodows.get(0));

        System.out.println(driver.getTitle());
        driver.quit();
    }
}
