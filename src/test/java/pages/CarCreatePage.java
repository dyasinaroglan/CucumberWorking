package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class CarCreatePage extends ParentClass {

    public CarCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement luserName;

    @FindBy(id = "prependedInput2")
    public WebElement lpassword;

    @FindBy(id = "_submit")
    public WebElement lLoginButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement lFleet;

    @FindBy(xpath = "(//li[@class='dropdown-menu-single-item first'])[2]")
    public WebElement lVehicles;

    @FindBy(css = "a[title='Create Car']")
    public WebElement lCreateCar;

    @FindBy(id = "custom_entity_type_LicensePlate-uid-6278c726d56e3")
    public WebElement lLicensePlate;

    @FindBy(id = "custom_entity_type_Driver-uid-6278c726d5e90")
    public WebElement lDriver;

    @FindBy(id = "custom_entity_type_Location-uid-6278c726d5f7a")
    public WebElement lLocation;

    @FindBy(id = "custom_entity_type_ModelYear-uid-6278c726d6145")
    public WebElement lModelYear;

    @FindBy(id = "custom_entity_type_Color-uid-6278c726d68aa")
    public WebElement lColour;

    @FindBy(css = "a[class='btn-success btn dropdown-toggle']")
    public WebElement lButton;

    @FindBy(css = "button[class='action-button dropdown-item']")
    public WebElement lSaveAndClose;

    @FindBy(xpath = "(//button[@class='main-group action-button dropdown-item'])[1]")
    public WebElement lSaveAndNew;

}
