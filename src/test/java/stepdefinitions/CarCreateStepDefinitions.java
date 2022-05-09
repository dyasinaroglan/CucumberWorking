package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.CarCreatePage;
import utilities.ParentClass;

import java.util.List;
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
        sleepTo(1000);
        actions.moveToElement(carCreatePage.lFleet).pause(1000).perform();

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
            sendKeysTo(carCreatePage.lLicensePlate,map.get("License Plate"));
            sendKeysTo(carCreatePage.lDriver,map.get("Driver"));
            sendKeysTo(carCreatePage.lLocation,map.get("Location"));
            sendKeysTo(carCreatePage.lModelYear,map.get("Model Year"));
            sendKeysTo(carCreatePage.lColour,map.get("Color"));

            clickTo(carCreatePage.lButton);

            if(row == dataTable.size()){
                clickTo(carCreatePage.lSaveAndClose);
            }else {
                clickTo(carCreatePage.lSaveAndNew);
            }
            row++;
        }


    }
}
