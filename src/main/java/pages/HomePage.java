package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.jvm.hotspot.jdi.ByteTypeImpl;

/**
 * Created by sramalin on 28/07/16.
 */
public class HomePage {

    public String loggedinUserName;
    WebDriver webdriver;

    public  HomePage(WebDriver webDriver, String loggedinUserName){

        this.webdriver = webDriver;
        this.loggedinUserName = loggedinUserName;
    }

    public String getLoggedinUserDisplayText(){
       //Assert.assertTrue(webdriver.findElement(By.className("user-info")).getText().equalsIgnoreCase(username));
        return webdriver.findElement(By.className("user-info")).getText();
    }
}
