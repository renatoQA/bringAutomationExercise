package cucumberLogic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectsMap.flightPageObjects;

public class flightPageSD {
	
	flightPageObjects flight = new flightPageObjects();
	
	/*
	 * *
	 * The steps below are all used in the Flight details Pages part and their respective methods
	 */

	
	@Given("that I change a departure {string}")
	public void that_i_change_a_departure_date(String dateOne) throws InterruptedException {
	for (int i = 0; i < 28; i++) {
	   Thread.sleep(1500);
	  flight.ClickArrowBar("2");
	}
		Thread.sleep(1500);
	flight.ClickDay(dateOne, "1");
	flight.ClickFirstBanner();
	}
	@When("i select the tarifa value travel light")
	public void i_select_the_tarifa_value_travel_light() throws InterruptedException {
		 flight.ClickValueTravelLight();
	}
	@When("i change a return {string}")
	public void i_change_a_return_date(String dateTwo) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			   Thread.sleep(1500);
			   flight.ClickArrowBar("4");
			}
		 flight.ClickDay(dateTwo, "2");
		 flight.ClickSecondBanner();
	}
	@When("i click on login later button")
	public void i_click_on_login_later_button() {
		flight.ClickLoginLater();
	}
	@When("i fill the informations of passenger one,{string} and {string}")
	public void i_fill_the_informations_of_passenger_one(String NameOne , String LastNameOne) throws InterruptedException {
		flight.SelectTitlePassenger("1", "2");
        flight.fillPassengerName("1", NameOne, "1", LastNameOne);
	}
	@When("i fill the informations of passenger two,{string} and {string}")
	public void i_fill_the_informations_of_passenger_two(String NameTwo, String LastNameTwo) throws InterruptedException {
		flight.SelectTitlePassenger("1", "1");
		flight.fillPassengerName("1", NameTwo, "1", LastNameTwo);
	}
	@When("i fill the informations of passenger three,{string} and {string}")
	public void i_fill_the_informations_of_passenger_three(String NameThree, String LastNameThree) throws InterruptedException {
		 flight.fillPassengerName("1", NameThree, "1", LastNameThree);
	}
	@Then("i click on continue button")
	public void i_click_on_continue_button() {
		flight.ClickContinueButton();
	}
}
