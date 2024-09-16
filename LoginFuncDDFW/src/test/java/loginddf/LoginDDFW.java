package loginddf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDFW {

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
    public void ValidLoginFunc (String username, String password){
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        Assert.assertEquals(driver.getTitle(),Title);

        String ErrorMessage=driver.switchTo().alert().getText();
        Assert.assertEquals(ErrorMessage,this.ErrorMessage);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @DataProvider
    public String[][] dataSupply(){

    String[][] LoginData=new String[3][2];

    LoginData[0][0]="mngr589555";
    LoginData[0][1]="hesEveb";

    LoginData[1][0]="Invalid";
    LoginData[1][1]="Invalid@123";

    LoginData[2][0]="    ";
    LoginData[2][1]="    ";

    return LoginData;
}
}
