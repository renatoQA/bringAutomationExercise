package objectsMap;

import org.openqa.selenium.By;

import System.DriverFactory;

public class accommodationsPageObject {
	
	/*
	 * The objects below are all used in the Accommodations and Seats Page part and their respective actions
	 */

	public void ClickOkayButton() throws InterruptedException {
		Thread.sleep(10000);
		DriverFactory.getDriver().findElement(By.xpath ("//button[@class='seats-modal__cta ry-button--gradient-blue']")).click();
	}
	public void ClickSitAvailable(String seat) {
		DriverFactory.getDriver().findElement(By.xpath ("//button[@id='"+seat+"']")).click();
	}
	public void ClickNextFlightButton() {
		DriverFactory.getDriver().findElement(By.xpath ("//button[@data-ref='seats-action__button-next']")).click();
	}
	public void ClickContinueButton() {
		DriverFactory.getDriver().findElement(By.xpath ("//button[contains(text(),'Continue')]")).click();
	}
	public void ClickNoThanksButton() {
		DriverFactory.getDriver().findElement(By.xpath ("//button[contains(text(),'No, thanks')][1]")).click();
	}
	public void ClickOverviewButton() {
		DriverFactory.getDriver().findElement(By.xpath ("//a[contains(text(),'Overview')]")).click();
	}

}
