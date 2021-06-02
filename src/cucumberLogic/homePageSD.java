package cucumberLogic;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectsMap.homePageObjects;

public class homePageSD {
	
	homePageObjects home = new homePageObjects();
	
	/*
	 * *
	 * The steps below are all used in the Home Page part and their respective methods
	 */
	

	@Given("that I access Ryanairs url")
	public void that_i_access_ryanairs_url() throws FileNotFoundException, IOException, ParseException {
		home.getUrl();
		home.clickAgree();
	}
	@When("I fill the field FROM with Lisbon, {string}")
	public void i_fill_the_field_from_with_lisbon(String Departure) throws InterruptedException {
		home.DepartureField(Departure);
		Thread.sleep(5000);
		home.CityLisbonButton();
	}
	@When("I fill the field TO with Paris Beauvais, {string}")
	public void i_fill_the_field_to_with_paris_beauvais(String Return) throws InterruptedException {
        home.DestinationField(Return);
        Thread.sleep(5000);
        home.CityParisButton();
	}
	@When("I choose the date {string} ,two-thousand and twenty one in the Depart field")
	public void i_choose_the_date_june_in_the_depart_field(String Date) throws InterruptedException {
		Thread.sleep(2000);
        home.ClickDepartureDate();
        home.SetDate(Date);
	}
	@When("I choose the date {string},{string},two-thousand and twenty one in the Return field")
	public void i_choose_the_date_of_october_in_the_return_field(String Month, String Date) {
		home.SetMonth(Month);
		home.SetDate(Date);
	}
	@When("select two adults and one child in the Passengers field")
	public void select_two_adults_and_one_child_in_the_passengers_field() {
		home.ClickPassenger();
		home.SetNumberPassengerAdult();
		home.SetNumberPassengerChild();
	}
	@Then("i click on search button")
	public void i_click_on_search_button() {
       home.ClickButtonSearch();
	}

}
