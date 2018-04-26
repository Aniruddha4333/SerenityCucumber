package org.steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Contains;
import org.openqa.selenium.WebDriver;
import org.serenitysteps.UserSteps;
import org.tasks.NavigateTo;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.statematchers.ContainsSelectOptionMatcher;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.StringContains;


@RunWith(SerenityRunner.class)
public class BookFlightScenarioSteps {

	@Steps
	UserSteps user;
	
	@Managed
	WebDriver browser;
	
	@Test
	public void sample() {
		Actor actor = Actor.named("anirudha");
		actor.can(BrowseTheWeb.with(browser));
		when(actor).attemptsTo(NavigateTo.BookFlight());
		then(actor).should(seeThat(TheWebPage.title(),StringContains.containsString("Search")));
	}
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
	}
	
	@After
	public void close() {
		user.afterTest();
	}
	
	

	
	/*@Given("^when i Navigate to emirates home page$")
	public void when_i_Navigate_to_emirates_home_page()  {
		
		user.opens_home_page();
		
	}

	@When("^I  click on book a flight link$")
	public void i_click_on_book_a_flight_link()  {
		user.click_book_flight();
	}

	@Then("^I should land on Search flights page$")
	public void i_should_land_on_Search_flights_page() {
	
	}
	
	@When("^I  click on flight status link$")
	public void i_click_on_flight_status_link() {
		
		user.click_flight_status();
	}

	@Then("^I should land on Flight Status page$")
	public void i_should_land_on_Flight_Status_page()  {
	   
	  
	}
	*/
	
}
