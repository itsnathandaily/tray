package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    WebDriver driver;
    /*public Loginpage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        try {
            login();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
*/
    public void login(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("chi.maduakor@gmail.com");
        driver.findElement(By.name("password")).sendKeys("tray1234");
        driver.findElement(By.className("Button___27l6Gy")).click();
    }
}
