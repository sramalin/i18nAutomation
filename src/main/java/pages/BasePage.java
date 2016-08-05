package pages;

/**
 * Created by sramalin on 28/07/16.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    WebDriver webDriver;
    String hostURL = "https://qa1.learn.cisco";


    public LoginPage launchApp(){


        System.setProperty("webdriver.chrome.driver", "../i18n_automation/src/chromedriver/chromedriverMAC");
        webDriver = new ChromeDriver();
        //webDriver = new FirefoxDriver();
        webDriver.navigate().to(hostURL);
        return new LoginPage(webDriver);



    }
}
