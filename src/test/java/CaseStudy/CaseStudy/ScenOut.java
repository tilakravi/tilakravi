package CaseStudy.CaseStudy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenOut {
	
	@Given("^User must be in the login page$")
	public void user_must_be_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("User is in the login page");
		
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("login using"+arg1+" and "+arg2);
	}

	@When("^performs login$")
	public void performs_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		System.out.println("click on the login button");
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("User is in the home page");
		System.out.println("************************");
	}

}
