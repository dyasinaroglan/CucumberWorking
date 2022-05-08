package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HerOkuAppPage;
import utilities.ParentClass;

public class HerOkuAppStepDefinitions extends ParentClass {

    HerOkuAppPage herOkuAppPage = new HerOkuAppPage();

    @Given("{string} go to site")
    public void goToSite(String url) {
        gotoSite(url);
    }

    @When("Add element butonuna tıklayınız")
    public void addElementButonunaTıklayınız() {
        clickTo(herOkuAppPage.addToElement);
    }

    @And("Delete butonunun görünür olduğunu doğrulayınız")
    public void deleteButonununGörünürOlduğunuDoğrulayınız() {
        herOkuAppPage.lDeleteButton.isDisplayed();
        Assert.assertTrue(herOkuAppPage.lDeleteButton.isDisplayed(),"test geçmedi");
    }

    @And("Delete butonuna tıklayınız")
    public void deleteButonunaTıklayınız() {
        clickTo(herOkuAppPage.lDeleteButton);
    }

    @Then("sayfayı kapatalım")
    public void sayfayıKapatalım() throws InterruptedException {
        quitDriver();
    }
}
