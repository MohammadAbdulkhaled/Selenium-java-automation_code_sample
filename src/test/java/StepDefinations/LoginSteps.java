package StepDefinations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	
	
	@When("user enters the below details in the fields")
	public void user_enters_the_below_details_in_the_fields(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		System.out.println("user enters the first name as "+map.get("firstname"));
		System.out.println("user enters the last name as "+map.get("lastname"));
		System.out.println("user enters the emailid as "+map.get("emailid"));
		
		
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is landed to login page");
	}

	@When("^user enters (.+)username and (.+)password$")
	public void user_enters_username_and_password(String userid, String password) {
		System.out.println("...user enters"+userid  +"user name"+" "+password + "password successfully");
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicks on ok button");
	    
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user landed to home page");
	    
	}




}
