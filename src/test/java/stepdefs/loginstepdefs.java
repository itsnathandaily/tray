package stepdefs;

import Util.Util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.DashboardPage;
import pageobjects.Loginpage;

public class loginstepdefs extends Util{
    WebDriver driver;
    Loginpage login = new Loginpage();
    DashboardPage workflow = new DashboardPage();
    @Given("^I am at the trayio \"([^\"]*)\" website$")
    public void i_am_at_the_tray_io_website(String page) throws Throwable {
    driver = getDriver();
    launch(page);
    }

    @Given("^I log in$")
    public void i_log_in() throws Throwable {
        //System.out.println("Hello World!!!!");
        login.login(driver);
    }

    @Then("^I should see the Dashboard$")
    public void i_should_see_the_Dashboard() throws Throwable {
        workflow.confirmLogin(driver);
    }

    @When("^I click on create a new workflow$")
    public void i_click_on_create_a_new_workflow() throws Throwable {
        workflow.createWorkflow();
    }

    @Then("^I should see the trigger selection screen$")
    public void i_should_see_the_trigger_selection_screen() throws Throwable {
        workflow.confirmTriggersExist();
    }

    @When("^I click the close button$")
    public void i_click_the_close_button() throws Throwable {
        workflow.closeTriggerPage();

    }

    @Then("^I should see the workflow$")
    public void i_should_see_the_workflow() throws Throwable {
        workflow.confirmCreatedWorkFlowExist();
    }

    @When("^I delete the workflow$")
    public void i_delete_the_workflow() throws Throwable {
        workflow.deleteWorkflowCreated();
    }

    @When("^I confirm that the workflow is deleted$")
    public void i_confirm_that_the_workflow_is_deleted() throws Throwable {
        workflow.confirmWorkflowIsDeleted();
    }

    @Then("^I should log out$")
    public void i_should_log_out() throws Throwable {
        workflow.logout();

    }

}
