package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.Driver.getDriver;

public class AbstractClass {

    private static WebDriver driver= getDriver();
     static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    public static void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        clickElement.click();


    }


    public static void sendKeysFunction(WebElement sendKeysElement, String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);
    }


    /* public void selectElementFromDropdown(WebElement dropdown, String element){

        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }
    
    public  void  Assertion(WebElement actual, String expected){
        
        wait.until(ExpectedConditions.visibilityOf(actual));

        System.out.println("My message : " + actual.getText());
        
    }*/
}
