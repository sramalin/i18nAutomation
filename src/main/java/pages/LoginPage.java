package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by sramalin on 28/07/16.
 */
public class LoginPage {

    public WebDriverWait wait;
    WebDriver webdriver;

    public LoginPage(WebDriver webDriver){
        wait = new WebDriverWait(webDriver,30000);
        this.webdriver = webDriver;
    }

    public HomePage doLogin(String username, String pwd){


        webdriver.findElement(By.name("email")).sendKeys(username);
        webdriver.findElement(By.className("btn")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("IDToken2")));
        webdriver.findElement(By.id("IDToken2")).sendKeys((pwd));
        webdriver.findElement(By.className("btn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("user-info")));
        return new HomePage(webdriver,username);

    }
}
