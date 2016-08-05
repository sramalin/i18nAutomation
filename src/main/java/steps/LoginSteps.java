package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by sramalin on 28/07/16.
 */
public class LoginSteps {
    private LoginPage logingpage;
    private HomePage homepage;

    @Given("^I launch the app$")
    public void I_launch_the_app() throws Throwable {
        BasePage basepage = new BasePage();
        logingpage = basepage.launchApp();
    }

    @When("^I login with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void I_login_with_user_name_and_password(String username, String pwd) throws Throwable {
        // Express the Regexp above with the code you wish you had
        homepage = logingpage.doLogin(username, pwd);
    }

    @Then("^Home page should be loaded$")
    public void Home_page_should_be_loaded() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println(homepage.getLoggedinUserDisplayText());
    }
}
