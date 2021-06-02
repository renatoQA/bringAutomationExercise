package objectsMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import System.DriverFactory;

public class flightPageObjects {
	
	/*
	 * The objects below are all used in the Flight details Page part and their respective actions
	 */

	public void ClickArrowBar (String Column) {
		DriverFactory.getDriver().findElement(By.xpath ("(//carousel-arrow[@class='ng-star-inserted'])["+Column+"]")).click();
	}
	
	public void ClickDay(String Day , String Column) throws InterruptedException {
	   Thread.sleep(2000);
       DriverFactory.getDriver().findElement(By.xpath ("(//div[contains(text(),'"+Day+"')])["+Column+"]")).click();
	}
    
	public void ClickFirstBanner() {
		DriverFactory.getDriver().findElement(By.xpath ("/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-summary-container/flights-summary/div/div[1]/journey-container/journey/flight-list/div/flight-card/div/div/div[1]/div")).click();
	}
	public void ClickSecondBanner() {
		DriverFactory.getDriver().findElement(By.xpath("/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-summary-container/flights-summary/div/div[2]/journey-container/journey/flight-list/div/flight-card/div/div/div[1]/div")).click();
	}
	
	
	public void ClickValueTravelLight() throws InterruptedException {
		WebElement travelLight = DriverFactory.getDriver().findElement(By.xpath ("//button[@class='fare-card__button fare-card__price ry-button--outline-dark-blue']"));
		Thread.sleep(3000);
		
		if (travelLight.isDisplayed() == true) {
			DriverFactory.getDriver().findElement(By.xpath ("//button[@class='fare-card__button fare-card__price ry-button--outline-dark-blue']")).click();
		}
	}
    public void ClickLoginLater() {
    	DriverFactory.getDriver().findElement(By.xpath ("//button[@class='login-touchpoint__expansion-bar']")).click();
    }
    public void SelectTitlePassenger(String Passenger, String Title) throws InterruptedException {
    	Thread.sleep(3000);
    	DriverFactory.getDriver().findElement(By.xpath ("(//button[@class='dropdown__toggle b2'])["+Passenger+"]")).click();
    	DriverFactory.getDriver().findElement(By.xpath ("(//div[@class='dropdown-item__label b2'])["+Title+"]")).click();
    	
    }
    public void fillPassengerName(String Field01 ,String Name,String Field02, String LastName) throws InterruptedException {
    	Thread.sleep(3000);
    	DriverFactory.getDriver().findElement(By.xpath ("(//input[@class='b2 date-placeholder'])["+Field01+"]")).sendKeys(Name);
    	DriverFactory.getDriver().findElement(By.xpath ("(//input[@class='b2 date-placeholder'])["+Field02+"]")).sendKeys(LastName);

    }
    public void ClickContinueButton() {
    	DriverFactory.getDriver().findElement(By.xpath ("//button[contains(text(),'Continue')][1]")).click();
    }
}

