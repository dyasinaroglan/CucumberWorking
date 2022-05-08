package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class SauceDemoPage extends ParentClass {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user-name")
    public WebElement luserName;

    @FindBy(id = "password")
    public WebElement lpassword;

    @FindBy(id = "login-button")
    public WebElement lLoginButton;

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    public WebElement lilkUrun;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement lAddToCart;

    @FindBy(css = "a[class='shopping_cart_link']")
    public WebElement sepet;

    @FindBy(css = "div[class='inventory_item_name']")
    public WebElement productBox;
}
