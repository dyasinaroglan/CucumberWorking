package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ParentClass;

public class DemoGuruStepDefinitions extends ParentClass {

    DemoGuruPage demoGuruPage = new DemoGuruPage();
    Actions builder = new Actions(Driver.getDriver());

    @Given("Given {string} ana sayfasina gidelim")
    public void givenAnaSayfasinaGidelim(String url) {
        demoGuruPage.gotoSite(url);

    }

    @When("Drag and drop the second {int} button to the Amount section in CREDIT SIDE")
    public void dragAndDropTheSecondButtonToTheAmountSectionInCREDITSIDE(int arg0) {
        builder.dragAndDrop(demoGuruPage.second5000,demoGuruPage.creditAmount).perform();

    }
    @And("Drag and drop the BANK button to the Account section in DEBIT SIDE")
    public void dragAndDropTheBANKButtonToTheAccountSectionInDEBITSIDE() {
        builder.dragAndDrop(demoGuruPage.salesButton,demoGuruPage.creditAccount).perform();
    }

    @And("Drag and drop the SALES button to the Account section in CREDIT SIDE")
    public void dragAndDropTheSALESButtonToTheAccountSectionInCREDITSIDE() {
        builder.dragAndDrop(demoGuruPage.bankButton,demoGuruPage.debitAccount).perform();
    }

    @And("Drag and drop the {int} button to the Amount section in DEBIT SIDE")
    public void dragAndDropTheButtonToTheAmountSectionInDEBITSIDE(int arg0) {
        builder.dragAndDrop(demoGuruPage.fourth5000,demoGuruPage.debitAmount).perform();
    }

    @Then("PerfectButton visibilty do test")
    public void perfectbuttonVisibiltyDoTest() {

        Assert.assertTrue(demoGuruPage.perfectMessage.isDisplayed());
    }

    @And("close page")
    public void closePage() throws InterruptedException {
        sleepTo(1000);
        quitDriver();
    }

}
