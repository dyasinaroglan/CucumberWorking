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

    @FindBy(css = "input[name='custom_entity_type[LicensePlate]']")
    public WebElement lLicensePlate;

    @FindBy(css = "input[name='custom_entity_type[Driver]']")
    public WebElement lDriver;

    @FindBy(css = "input[name='custom_entity_type[Location]']")
    public WebElement lLocation;

    @FindBy(css = "input[name='custom_entity_type[ModelYear]']")
    public WebElement lModelYear;

    @FindBy(css = "input[name='custom_entity_type[Color]']")
    public WebElement lColour;

    @FindBy(css = "a[class='btn-success btn dropdown-toggle']")
    public WebElement lButton;

    @FindBy(css = "button[class='action-button dropdown-item']")
    public WebElement lSaveAndClose;

    @FindBy(xpath = "(//button[@class='main-group action-button dropdown-item'])[1]")
    public WebElement lSaveAndNew;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement lActivities;

    @FindBy(xpath = "li[data-route='oro_calendar_event_index']")
    public WebElement lCalenderEvents;

    @FindBy(css = "span[class='grid-header-cell__label']")
    public WebElement lMenuList;

}
