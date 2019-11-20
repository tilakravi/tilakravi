package CaseStudy.CaseStudy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class regressiontesting {
	
	
	@Given("^User is testing for the login functionality$")
	public void user_is_testing_for_the_login_functionality() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Login !!");
	}

	@Then("^User able to login successfully$")
	public void user_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("login successful !!");
	}

	@Given("^User is testing the search functionality$")
	public void user_is_testing_the_search_functionality() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("search for a product");
	}

	@Then("^search works successfully$")
	public void search_works_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("search is successful !!");
	}

	@Then("^\"([^\"]*)\" is the tester of TestMe Application$")
	public void is_the_tester_of_TestMe_Application(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(arg1+" is the tester");
	}

}
