package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Util {
    protected static WebDriver driver;
    public static WebDriver getDriver() {

        if (driver == null){
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(capabilities);

        }

        return driver;
    }


    public static void launch(String page){

        driver.get(page);
    }
    public static String WORKFLOWNAME = "NATHANWORKFLOW";
}
