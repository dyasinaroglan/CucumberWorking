package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return Driver.getDriver(Browsers.CHROME);
    }

    public static WebDriver getDriver(Browsers browsers){
        if(drivers.get() == null){
            switch (browsers){
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    drivers.set(new EdgeDriver());
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    drivers.set(new FirefoxDriver());
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    drivers.set(new ChromeDriver());
                    break;
            }
        }
        return drivers.get();
    }
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(1000);
        if(drivers.get() != null){
            drivers.get().quit();
            drivers.set(null);
        }
    }
}
