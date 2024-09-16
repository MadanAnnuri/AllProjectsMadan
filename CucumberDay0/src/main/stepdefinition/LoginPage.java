package stepdefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;


public class LoginPage {

    @Given("I am in login page")
    public void i_am_in_login_page() {
        System.out.println("i an in login page");
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("entering details");

    }
    @When("i click on submit button")
    public void i_click_on_submit_button() {

        System.out.println("click on submit button");
    }
    @Then("I shouid land on successfull login")
    public void i_shouid_land_on_successfull_login() {
        System.out.println("logged in succsessfully");

    }


}
