package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class EbebekPage extends ParentClass {

    public EbebekPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "js-site-search-input")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='product-title brand-text product-name-txt'])[1]")
    public WebElement lArananUrun;
}
