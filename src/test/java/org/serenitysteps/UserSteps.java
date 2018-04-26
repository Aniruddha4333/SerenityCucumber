package org.serenitysteps;

import org.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	HomePage homepage;
	
	@Step
	public void opens_home_page() {
		homepage.open();
		
	}
	
	@Step
	public void click_book_flight() {
		homepage.clickBookFlight();
	}
	
	@Step
	public void click_flight_status() {
		homepage.clickOnFlightStatus();
	}
	
	@Step
	public void afterTest() {
		getDriver().close();
	}
}
