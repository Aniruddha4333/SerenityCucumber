package org.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://mobile.emirates.com/english/home.xhtml")
public class HomePage extends PageObject {
	
	@FindBy(id="hom_hom_bookFlt")
	private WebElement bookFlight;
	
	@FindBy(css="#hom_hom_fltStus")
	private WebElement flightStatus;
	
	
	public WebElementFacade getBookFlightObj() {
		return (WebElementFacade) bookFlight;
		
	}
	
	public void clickBookFlight() {
		
		element(bookFlight).waitUntilClickable().click();
		
	}
	
	public void clickOnFlightStatus() {
		element(flightStatus).waitUntilClickable().click();
	}

}
