package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement Location= driver.findElement(By.id("source_118"));
        Select selLocation= new Select(Location);
        selLocation.selectByVisibleText("Bangalore");
        selLocation.selectByVisibleText("Chennai");
        selLocation.selectByVisibleText("Delhi");
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement selectedLocation =driver.findElement(By.id("fld_118"));
        Select SelJobLocation= new Select(selectedLocation);
        SelJobLocation.selectByVisibleText("Bangalore");
        SelJobLocation.selectByVisibleText("Delhi");
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();






    }
}
