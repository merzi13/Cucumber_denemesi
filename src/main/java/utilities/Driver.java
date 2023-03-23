package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    static private WebDriver driver;//null, baska hicbir classtan bu objeme ellenemez
    static Driver driverClassObje;


    //default constructor of the class
    //java bilgisi private:access modifier
    private Driver() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments(
                "--start-maximized",
                "--disable-notifications", //bildirim almak ister misin pop-up'ini otomatik kapatir
                "--remote-allow-origins=*" // Chrome111 ile aldigimiz hatanin cozumu icin
        );

        driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
    }

    static public WebDriver getDriver() {

        if (driver == null) {
        driverClassObje = new Driver();

        }
        return  driver;
    }

     static public WebDriver launchBrowserAgain(){

         driverClassObje=new Driver();
         return driver;
    }

}
