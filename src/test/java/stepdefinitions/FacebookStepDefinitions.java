package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FacebookPage;
import utilities.ParentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FacebookStepDefinitions extends ParentClass {

    FacebookPage facebookPage = new FacebookPage();

    @Given("siteye git {string}")
    public void siteyeGit(String url) {
        gotoSite(url);
    }

    @When("Facebook email textBox and password textBox gir")
    public void facebookEmailTextBoxAndPasswordTextBoxGir(Map<String,String> dataTable) { //DataTable senaryoda tanımladığımız veri tablosundan
        //verileri kullanmamıza olanak sağlıyor

        sendKeysTo(facebookPage.lemail,dataTable.get("email"));
        sendKeysTo(facebookPage.lPassword,dataTable.get("password"));
    }

    @And("facebook login butonuna tıklayınız")
    public void facebookLoginButonunaTıklayınız() {
        clickTo(facebookPage.lLogin);
    }

    @Then("başarısız girişi doğrulayınız")
    public void başarısızGirişiDoğrulayınız() {
        Assert.assertTrue(facebookPage.lmessage.isDisplayed());
    }
    @And("siteden çıkınız")
    public void sitedenÇıkınız() throws InterruptedException {
        sleepTo(1000);
        quitDriver();
    }
}
