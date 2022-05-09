package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.CarCreatePage;
import utilities.ParentClass;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CarCreateStepDefinitions extends ParentClass {

    CarCreatePage carCreatePage = new CarCreatePage();

    @Given("user is on login page {string}")
    public void userIsOnLoginPage(String url) {
        gotoSite(url);
    }

    @And("user logs in as store manager")
    public void userLogsInAsStoreManager(Map<String,String> dataTable) throws InterruptedException {
        sendKeysTo(carCreatePage.luserName,dataTable.get("username"));
        sendKeysTo(carCreatePage.lpassword,dataTable.get("password"));
        clickTo(carCreatePage.lLoginButton);
        sleepTo(1000);
    }

    @When("user navigates to {string} then to {string}")
    public void userNavigatesToThenTo(String arg0, String arg1) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(carCreatePage.lFleet).pause(1000).perform();
        sleepTo(2000);
        clickTo(carCreatePage.lVehicles);
    }

    @And("user click on {string} button")
    public void userClickOnButton(String arg0) throws InterruptedException {
        sleepTo(4000);
        clickTo(carCreatePage.lCreateCar);
    }

    @Then("user adds new car information:")
    public void userAddsNewCarInformation(List<Map<String, String>> dataTable) throws InterruptedException {

        int row = 1;
        sleepTo(2000);
        for (Map<String, String> map : dataTable) {
            sleepTo(1000);
            sendKeysTo(carCreatePage.lLicensePlate,map.get("License Plate"));
            sendKeysTo(carCreatePage.lDriver,map.get("Driver"));
            sendKeysTo(carCreatePage.lLocation,map.get("Location"));
            sendKeysTo(carCreatePage.lModelYear,map.get("Model Year"));
            sendKeysTo(carCreatePage.lColour,map.get("Color"));

            clickTo(carCreatePage.lButton);
            sleepTo(2000);

            if(row == dataTable.size()){
                clickTo(carCreatePage.lSaveAndClose);
            }else {
                clickTo(carCreatePage.lSaveAndNew);
            }
            row++;
        }
    }

    @When("user navigates to Activities button")
    public void userNavigatesToActivitiesButton() throws InterruptedException {
        Actions builder = new Actions(driver);
        sleepTo(5000);
        builder.moveToElement(carCreatePage.lActivities).pause(1000).perform();
        sleepTo(1000);
        clickTo(carCreatePage.lCalenderEvents);

    }
    @Then("user verifies that column names are displayed")
    public void userVerifiesThatColumnNamesAreDisplayed() throws InterruptedException {
        sleepTo(2000);
       // clickTo(carCreatePage.lCalenderEvents);
    }

    @And("user navigates to Calender Events button")
    public void userNavigatesToCalenderEventsButton(List<String> dataTable) throws InterruptedException {
        System.out.println(dataTable);
        for (String s : dataTable) {
            sleepTo(1000);
            Assert.assertEquals(dataTable, dataTable.contains(s));
        }
    }
}
