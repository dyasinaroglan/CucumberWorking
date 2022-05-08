package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CarLoginPage;
import utilities.ParentClass;

import java.util.Map;

public class CarLoginStepDefinitions extends ParentClass {

    CarLoginPage carLoginPage = new CarLoginPage();

    @Given("user is on the login page {string}")
    public void userIsOnTheLoginPage(String url) {
        gotoSite(url);

    }

    @When("user logs in as driver with following credentials")
    public void userLogsInAsDriverWithFollowingCredentials(Map<String,String> dataTable) {
        sendKeysTo(carLoginPage.lUserName,dataTable.get("username"));
        sendKeysTo(carLoginPage.lPassword,dataTable.get("password"));
        clickTo(carLoginPage.lsubmit);
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void userVerifiesThatPageSubtitleIsDisplayed(String text) {
        Assert.assertEquals(text,carLoginPage.lmessageTitle.getText());
    }
}
