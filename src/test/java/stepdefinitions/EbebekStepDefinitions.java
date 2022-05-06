package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.EbebekPage;
import utilities.ParentClass;

import java.util.List;
import java.util.Locale;

public class EbebekStepDefinitions extends ParentClass {

    EbebekPage ebebekPage = new EbebekPage();

    @Given("{string} sayfasına gidin")
    public void sayfasınaGidin(String url) {
        gotoSite(url);
    }

    @When("{string} icin arama yapar")
    public void icinAramaYapar(String text) {
        sendKeysTo(ebebekPage.searchButton,text + Keys.ENTER);

    }

    @And("Arama içeriğinin {string} olduğunu doğrular")
    public void aramaIçeriğininOlduğunuDoğrular(String arananUrun) throws InterruptedException {
        sleepTo(1000);

        //scrollIntoView(ebebekPage.lArananUrun);
        Assert.assertTrue(ebebekPage.lArananUrun.getText().toLowerCase(Locale.ROOT).contains(arananUrun.toLowerCase(Locale.ROOT)));
    }

    @And("ilk sonuc sayfasinda listelenen urunleri yazdirir")
    public void ilkSonucSayfasindaListelenenUrunleriYazdirir() throws InterruptedException {
        List<WebElement> productsName = driver.findElements(By.xpath("(//div[@class='product-brand brand-text brand-name-bold brand-name-top'])"));

        for (int i = 0; i < productsName.size(); i++) {
            sleepTo(1000);
            System.out.println(i+1+ "-" + productsName.get(i).getText());

        }
    }

    @Then("sayfayı kapatir")
    public void sayfayıKapatir() throws InterruptedException {
        sleepTo(1000);
        quitDriver();
    }
}
