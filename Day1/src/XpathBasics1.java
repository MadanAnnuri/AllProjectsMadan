import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasics1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//a[contains(@href,'add_c')]")).click();
        driver.findElement(By.xpath("//a[text()='View Customers']")).click();
        String name="Aamir";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//a[contains(@class,'edit')]")).click();


    }
}
