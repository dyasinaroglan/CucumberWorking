package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {


    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//input[@class='a-button-input'])[1]")
    public WebElement dontChange;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(css = "div[class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement searchProductsMessage;

    @FindBy(css = "img[class='s-image']")
    public WebElement picturesList;

}
