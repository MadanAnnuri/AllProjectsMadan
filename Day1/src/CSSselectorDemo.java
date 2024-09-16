import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/Investment-Failures-down-actually-learning/dp/B0CLPBR1CJ/ref=sr_1_1?crid=22PAN96HU5B4O&dib=eyJ2IjoiMSJ9.Hqih2-KmxH23tljhVxuUQOvJH1h_cPWTitJYrs4Xsiz2Xbz5hVae76qe7lDEa2JcWlqdCws-_X88mlG5sYfQDdZjSMS0KPEpL3WzJ4nJb7s.KcjcK1x-GzpnGKuubgLMURX1yEdEOHCEuu8h6jjJevA&dib_tag=se&keywords=amol+ujagare&qid=1721671220&sprefix=amol+ujag%2Caps%2C212&sr=8-1");
        driver.findElement(By.xpath("//span[contains(text(),'Investment')]")).click();

    }
}
