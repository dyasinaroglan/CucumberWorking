package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class HerOkuAppPage extends ParentClass {

    public HerOkuAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "button[onclick='addElement()']")
    public WebElement addToElement;

    @FindBy(css = "button[class='added-manually']")
    public WebElement lDeleteButton;
}
