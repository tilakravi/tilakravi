package CaseStudy.CaseStudy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberClass {
	int a,b,s,p;
	@Given("^User must enter input values$")
	public void user_must_enter_input_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters input");
		a=10;
		b=20;
	    //throw new PendingException();
	}

	@Then("^assign values to variables a & b$")
	public void assign_values_to_variables_a_b() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(a+" "+b);
	    //throw new PendingException();
	}

	@When("^add two input$")
	public void add_two_input() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		s=a+b;
	}

	@Then("^display the sum$")
	public void display_the_sum() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Sum is "+s);

	}

	@When("^multiply two numbers$")
	public void multiply_two_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		p=a*b;
	}

	@Then("^display the product$")
	public void display_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Product is "+p);
	}



}
