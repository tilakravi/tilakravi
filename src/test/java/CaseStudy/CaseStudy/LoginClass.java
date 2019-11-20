package CaseStudy.CaseStudy;

import org.openqa.selenium.By;

//import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import CaseStudy.CaseStudy.pages;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
import CaseStudy.CaseStudy.UtilityClass;
public class LoginClass {
	WebDriver driver;

@Given("^user must be in the login page$")
public void user_must_be_in_the_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();

	driver = UtilityClass.openBrowser("chrome");
	driver.get("http://newtours.demoaut.com/");
}

@When("^user enters the valid credentials$")
public void user_enters_the_valid_credentials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	pages page = new pages(driver);
	page.do_login("tutorial", "tutorial");
}

@Then("^user must be in the home page$")
public void user_must_be_in_the_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
	Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	System.out.println("Logged in Successfully !!");
	driver.close();
}

}
