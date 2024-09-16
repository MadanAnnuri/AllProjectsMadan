import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ScrollandImplicitwaits {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formstone.it/components/dropdown/demo/");

      /*  JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("Window.ScrollBy(0,400)");*/

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       WebElement drp= driver.findElement(By.cssSelector("#demo_external-dropdown-selected"));
       drp.click();

        Select drpdown=new Select(drp);

        drpdown.selectByIndex(1);

        //driver.close();


    }
}
