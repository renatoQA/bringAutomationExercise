package cucumberLogic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objectsMap.accommodationsPageObject;

public class accommodationsPageSD {
	
	accommodationsPageObject accommodations = new accommodationsPageObject();
	
	/*
	 * The steps below are all used in the Accommodations and Seats Pages part and their respective methods
	 */
	
	@Given("that i click on Okay button")
	public void that_i_click_on_okay_button() throws InterruptedException {
      accommodations.ClickOkayButton();
	}
	@Then("I choose first flight accommodations, {string}, {string}, {string}")
	public void i_choose_first_flight_accommodations(String SeatOne , String SeatTwo , String SeatThree) {
		for (int i = 0; i < 3; i++) {
		accommodations.ClickSitAvailable(SeatOne);
		accommodations.ClickSitAvailable(SeatTwo);
		accommodations.ClickSitAvailable(SeatThree);
		if (i == 1) {
			accommodations.ClickNextFlightButton();
		}
	  }
	}
	@Then("I click on continue button")
	public void i_click_on_continue_button() {
		accommodations.ClickContinueButton();
	}
	@Then("i click on no thanks button")
	public void i_click_on_no_thanks_button() {
       accommodations.ClickNoThanksButton();
	}
	@Then("i click on Overview button")
	public void i_click_on_overview_button() {
		accommodations.ClickOverviewButton();

	}


}
