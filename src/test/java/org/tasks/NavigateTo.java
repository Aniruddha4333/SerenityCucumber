package org.tasks;

import javax.sound.midi.Instrument;

import org.pages.HomePage;

//import com.thoughtworks.selenium.webdriven.commands.Open;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {

	private HomePage homepage;
	
	@Override
	public <T extends Actor> void performAs(T arg0) {
		// TODO Auto-generated method stub
	
		Open.browserOn(homepage);
		Click.on(homepage.getBookFlightObj());
		 
	}
	public NavigateTo() {
		
	}
	
	public static Performable BookFlight() {
		
		
		return (Performable) Instrumented.instanceOf(NavigateTo.class);
		
	}
	

}
