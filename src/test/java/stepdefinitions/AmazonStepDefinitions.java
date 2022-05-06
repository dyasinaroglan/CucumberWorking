package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ParentClass;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Watchable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AmazonStepDefinitions extends ParentClass {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanıcı amazon sayfasına gider {string}")
    public void kullanıcıAmazonSayfasınaGider(String url) {
        gotoSite(url);
    }

    @And("{string} için arama yapar")
    public void içinAramaYapar(String text) {

        sendKeysTo(amazonPage.searchBox,text);
        clickTo(amazonPage.dontChange);
        clickTo(amazonPage.searchButton);
    }

    @And("resimleri indirir")
    public void resimleriIndirir() throws IOException {
        List<WebElement> pictures = driver.findElements(By.cssSelector("img[class='s-image']"));
        for (int i = 1; i < pictures.size() ; i++) {
            String resimSRC = pictures.get(i).getAttribute("src");
            URL resimURL = new URL(resimSRC);
            BufferedImage picturesKaydet = ImageIO.read(resimURL);
            ImageIO.write(picturesKaydet,"png", new File("src/test/java/pictureStore/resim" + i + ".png"));
            driver.manage().timeouts().getImplicitWaitTimeout();
        }
        driver.navigate().back();
    }

    @And("sayfayı kapatır")
    public void sayfayıKapatır() throws InterruptedException {
        quitDriver();

    }
}
