package pageobjects;

import Util.Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    String NoWorkFlowHeaderText;
    public void confirmLogin(WebDriver driver) throws InterruptedException {
        Thread.sleep(10000);
        this.driver=driver;
        NoWorkFlowHeaderText = driver.findElement(By.xpath("//h2[starts-with(text(),\"You Don't Have Any W\")]")).getText();
        Assert.assertEquals("Logged into Dashboard Page","YOU DON'T HAVE ANY WORKFLOWS",NoWorkFlowHeaderText);

    }

    public  void createWorkflow() throws InterruptedException {
        driver.findElement(By.xpath("(//a[text()=\"Create New Workflow\"])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("name")).sendKeys(Util.WORKFLOWNAME);
        Thread.sleep(5000);
        driver.findElement(By.className("success___3Tf3_d")).click();
    }

    public void confirmTriggersExist() throws InterruptedException {
        Thread.sleep(5000);
        String addTriggerTextHeader = driver.findElement(By.xpath("//h1[text()=\"Add a trigger\"]")).getText();
        Assert.assertEquals("Triggers Exist","ADD A TRIGGER",addTriggerTextHeader);
    }

    public void closeTriggerPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\"Close\"]")).click();
    }

    public void confirmCreatedWorkFlowExist() throws InterruptedException {
        Thread.sleep(5000);
       String WorkflowName = driver.findElement(By.className("Title___tbmihn")).getText();
        Assert.assertEquals(Util.WORKFLOWNAME,WorkflowName);
    }

    public void deleteWorkflowCreated() throws InterruptedException {
        driver.findElement(By.className("Options-menu-icon___1iiZar")).click();
        Thread.sleep(5000);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].click()", driver.findElement(By.linkText("DELETE")));
        Thread.sleep(2000);
        driver.findElement(By.className("success___3Tf3_d")).click();
    }

    public void confirmWorkflowIsDeleted() throws InterruptedException {
        Thread.sleep(2000);
        NoWorkFlowHeaderText = driver.findElement(By.xpath("//h2[starts-with(text(),\"You Don't Have Any W\")]")).getText();
        Assert.assertEquals("Logged into Dashboard Page","YOU DON'T HAVE ANY WORKFLOWS",NoWorkFlowHeaderText);
    }

    public void logout() throws InterruptedException {
        driver.findElement(By.id("userToggle")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Log Out")).click();
    }
}
