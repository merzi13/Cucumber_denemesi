package stepsDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

    @Given("automation exercise sitesine git")
    public void automation_exercise_sitesine_git() {

        System.out.println("Siteye gidildi.");
    }

    @Given("login butonuna tikla")
    public void login_butonuna_tikla() {

        System.out.println("Login butonuna tiklandi.");
    }

    @Given("isim gir")
    public void isim_gir() {

        System.out.println("Isim girildi.");
    }

    @Given("sifre gir")
    public void sifre_gir() {

        System.out.println("Sifre girildi.");
    }

    @When("submit butonuna tikladigimda")
    public void submit_butonuna_tikladigimda() {

        System.out.println("Submit butonuna tiklandi.");
    }

    @Then("success mesajini verify et")
    public void succes_mesajini_verify_et() {

        System.out.println("Login islemi basariyla tamamlandi.");
    }


}
