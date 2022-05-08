package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SauceDemoPage;
import utilities.ParentClass;

public class SauceDemoStepDefinitions extends ParentClass {

    SauceDemoPage sauceDemoPage = new SauceDemoPage();

    @Given("{string} sitesine gidin")
    public void sitesineGidin(String url) {
        gotoSite(url);
    }

    @When("username kısmına {string} yazdırın")
    public void usernameKısmınaYazdırın(String userName) {
        sendKeysTo(sauceDemoPage.luserName,userName);
    }

    @And("Password kutusuna {string} yazdirin")
    public void passwordKutusunaYazdirin(String password) {
        sendKeysTo(sauceDemoPage.lpassword,password);
        clickTo(sauceDemoPage.lLoginButton);
    }

    @And("Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin")
    public void ılkUrununIsminiKaydedinVeBuUrununSayfasinaGidin() {
        String ilkÜrün = sauceDemoPage.lilkUrun.getText();
        System.out.println("ilk ürün : " + ilkÜrün);
        clickTo(sauceDemoPage.lilkUrun);
    }

    @And("AddToCart butonuna basınız")
    public void addtocartButonunaBasınız() {
        clickTo(sauceDemoPage.lAddToCart);
    }

    @And("Alışveriş sepetine tıklayın")
    public void alışverişSepetineTıklayın() {
        clickTo(sauceDemoPage.sepet);
    }

    @Then("Sectiginiz urunun basarili olarak sepete eklendigini control edin")
    public void sectiginizUrununBasariliOlarakSepeteEklendiginiControlEdin() {
        Assert.assertTrue(sauceDemoPage.lilkUrun.getText().equals(sauceDemoPage.productBox.getText()));

    }

    @And("sayfayı kapatın")
    public void sayfayıKapatın() throws InterruptedException {
        quitDriver();
    }
}
