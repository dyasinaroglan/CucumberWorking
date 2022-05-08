package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class CarLoginPage extends ParentClass {

    public CarLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement lUserName;

    @FindBy(id = "prependedInput2")
    public WebElement lPassword;

    @FindBy(id = "_submit")
    public WebElement lsubmit;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement lmessageTitle;

}
