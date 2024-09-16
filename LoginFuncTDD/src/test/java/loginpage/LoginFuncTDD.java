package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class LoginFuncTDD {

    WebDriver driver;
    String url="https://demo.guru99.com/V4/";
    String Title="Guru99 Bank Manager HomePage";
    String ErrorMessage="User or Password is not valid";

    @BeforeMethod
    public void openBrowser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void ValidLoginFunc(){
        driver.findElement(By.name("uid")).sendKeys("mngr589555");
        driver.findElement(By.name("password")).sendKeys("hesEveb");
        driver.findElement(By.name("btnLogin")).click();
        Assert.assertEquals(driver.getTitle(),Title);
    }

    @Test
    public void invalidFunc1(){
        driver.findElement(By.name("uid")).sendKeys("Invalid");
        driver.findElement(By.name("password")).sendKeys("Invalid");
        driver.findElement(By.name("btnLogin")).click();
        String ErrorMessage=driver.switchTo().alert().getText();
        Assert.assertEquals(ErrorMessage,this.ErrorMessage);
    }

    @Test
    public void invalidFunc2(){
        driver.findElement(By.name("uid")).sendKeys(" ");
        driver.findElement(By.name("password")).sendKeys(" ");
        driver.findElement(By.name("btnLogin")).click();
        String ErrorMessage=driver.switchTo().alert().getText();
        Assert.assertEquals(this.ErrorMessage,ErrorMessage);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
