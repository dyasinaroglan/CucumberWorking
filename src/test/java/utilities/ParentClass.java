package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    public void gotoSite(String url){
        driver.get(url);
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void clickTo(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendKeysTo(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void sendKeysTo(WebElement element,String text){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }
    public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public void sleepTo(long milis) throws InterruptedException {
        Thread.sleep(milis);
    }
    public void quitDriver() throws InterruptedException {
        sleepTo(1000);
        driver.quit();
    }
    public void hover(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
}
