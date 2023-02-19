package stepsDefination;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.time.Duration;

import static utilities.Driver.getDriver;

public class contactUs_Steps {
    private WebDriver driver;

    contactUs_Page contactUs_page= new contactUs_Page();

    @Given("navigate to Website")
    public void navigate_to_website() throws Throwable{
        driver= getDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Given("click on contact us button")
    public void click_on_contact_us_button() throws Throwable{
      contactUs_Page.clickContactUsButton();

    }

    @Given("type name")
    public void type_name() throws Throwable{
       contactUs_Page.enterName();

    }

    @Given("type Email")
    public void type_email() throws Throwable {
       contactUs_Page.enterEmail();

    }

    @Given("type subject")
    public void type_subject() throws Throwable{
       contactUs_Page.enterSubject();

    }

    @Given("type a message")
    public void type_a_message() throws Throwable{
        contactUs_Page.enterMessage();

    }

    @When("click on send button")
    public void click_on_send_button() throws Throwable{
       contactUs_Page.clickSubmitButton();
       contactUs_Page.alert();

    }



    @Then("verify success message")
    public void verify_success_message() throws Throwable{




    }

}
