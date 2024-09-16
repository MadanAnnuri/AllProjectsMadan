package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;

import static org.testng.Assert.*;

public class LoginPage {
    WebDriver driver= new ChromeDriver();

    @Given("I am in login page")
    public void i_am_in_login_page() {
        System.out.println("openUrl");
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @When("I enter correct Username and Password")
    public void i_enter_correct_username_and_password() {
        System.out.println("enter details");
         Alert alert=driver.switchTo().alert();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("",alert);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File f=ts.getScreenshotAs(OutputType.FILE);


        ((JavascriptExecutor) driver).executeScript("");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");

    }
    @When("Click on submit button")
    public void click_on_submit_button() {
        System.out.println("click on submit button");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

    }
    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("Login successfull");
        assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");

    }

}
