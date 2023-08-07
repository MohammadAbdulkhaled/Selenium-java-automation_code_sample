package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.messages.types.Scenario;

public class Myhooks {
	@Before
	public void setUp(Scenario scenario) {
		System.out.println("Browser got opened!!!!!...");
		System.out.println("Hooks got excecuted for before scenario.."+scenario.getName());
	}
	@After
	public void closeDown(Scenario scenario) {
		System.out.println("Browser got closed!!!!!...");
		System.out.println("Hooks got excecuted for After scenario.."+scenario.getName());
	}
	@BeforeStep
	public void beforStep() {
		System.out.println("before every step");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("after every step");
	}

}
