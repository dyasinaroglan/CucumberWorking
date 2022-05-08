package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class FacebookPage extends ParentClass {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "email")
    public WebElement lemail;

    @FindBy(id = "pass")
    public WebElement lPassword;

    @FindBy(css = "button[value='1']")
    public WebElement lLogin;

    @FindBy(css = "div[class='_9ay7']")
    public WebElement lmessage;
}
