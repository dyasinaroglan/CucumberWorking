package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ParentClass;

public class DemoGuruPage extends ParentClass {

    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement second5000;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[5]")
    public WebElement creditAmount;

    @FindBy(xpath = "(//a[@class='button button-orange'])[6]")
    public WebElement salesButton;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[4]")
    public WebElement creditAccount;

    @FindBy(xpath = "(//a[@class='button button-orange'])[5]")
    public WebElement bankButton;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[2]")
    public WebElement debitAccount;

    @FindBy(xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement fourth5000;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[3]")
    public WebElement debitAmount;

    @FindBy(xpath = "(//a[@class='button button-green'])[1]")
    public WebElement perfectMessage;
}
