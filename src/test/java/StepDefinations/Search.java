package StepDefinations;

import io.cucumber.java.en.*;

public class Search {
	@Given("user is on login23 page")
	public void user_is_on_login23_page() {
	   System.out.println(">>user is on login23 page");
	}

	@When("user enters username23 and password21")
	public void user_enters_username23_and_password21() {
		System.out.println(">>user enters username23 and password21");
	    
	}

	@When("clicks on login button1")
	public void clicks_on_login_button1() {
		System.out.println(">>clicks on login button1");
	   
	}

	@Then("user is navigated to home page1")
	public void user_is_navigated_to_home_page1() {
		System.out.println(">>user is navigated to home page1");
	    
	}




}
