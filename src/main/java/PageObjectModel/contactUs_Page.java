package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getDriver;

public class contactUs_Page extends AbstractClass{


    WebDriver driver;

    public contactUs_Page(){

        driver= getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")

    private static WebElement contactUsButton;

    public static void clickContactUsButton(){

        clickFunction(contactUsButton);
    }
    @FindBy(xpath = "//input[@data-qa='name']")

    private static WebElement nameArea;

    public static void enterName(){

        sendKeysFunction(nameArea,"bvfyhg");

    }
    @FindBy(xpath = "//input[@data-qa='email']")
    private static WebElement emailArea;

    public static void enterEmail(){

        sendKeysFunction(emailArea, "bvchgv@bchg.com");
    }
    @FindBy(xpath = "//input[@data-qa='subject']")

    private static WebElement subjectArea;

    public static void enterSubject(){

        sendKeysFunction(subjectArea, "Defolu Urun");
    }

    @FindBy(id = "message")

    private static WebElement messageArea;

    public static void enterMessage(){

        sendKeysFunction(messageArea,"Sizden 01.01.2020 tarihinde aldigim tshirt defoludur.iade etmek istiyorum");
    }
    @FindBy(xpath = "//input[@data-qa='submit-button']")

    private static WebElement submitButton;

    public static void clickSubmitButton(){

        clickFunction(submitButton);


    }
    public static void alert(){

        Alert uyari= getDriver().switchTo().alert();
        uyari.accept();


    }





}





