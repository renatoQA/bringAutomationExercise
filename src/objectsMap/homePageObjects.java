package objectsMap;

import static System.DriverFactory.getDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.LogStatus;

import System.DriverFactory;
import util.LogUtils;
import util.ReadJson;

public class homePageObjects {

	ReadJson json= new ReadJson();
	
	
	/**
	 * Navigate to url using JSON DATA
	 * 
	 * @throws InterruptedException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void getUrl() throws FileNotFoundException, IOException, ParseException {
		String url = json.readJson("url");
		getDriver().get(url);
		LogUtils.log(LogStatus.INFO, "Access Successfully");
		
		
	}
	/*
	 * The objects below are all used in the homePage part and their respective actions
	 */
	public void clickAgree() {
		DriverFactory.getDriver().findElement(By.xpath ("//button[@data-ref ='cookie.accept-all']")).click();
	}
	public void DepartureField(String Departure) throws InterruptedException {
		DriverFactory.getDriver().findElement(By.xpath ("//input[@id = 'input-button__departure']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		DriverFactory.getDriver().findElement(By.xpath ("//input[@id = 'input-button__departure']")).sendKeys(Departure);
		Thread.sleep(1000);
    }
	public void DestinationField(String Destination) throws InterruptedException {
		DriverFactory.getDriver().findElement(By.xpath ("//input[@id = 'input-button__destination']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		DriverFactory.getDriver().findElement(By.xpath ("//input[@id = 'input-button__destination']")).sendKeys(Destination);
		Thread.sleep(1000);
		
    }
	public void CityParisButton() {
		DriverFactory.getDriver().findElement(By.xpath ("//span[@data-id = 'BVA']")).click();
    }
	public void CityLisbonButton() {
		DriverFactory.getDriver().findElement(By.xpath ("//span[@data-id = 'LIS']")).click();
    }
	public void ClickDepartureDate() {
		DriverFactory.getDriver().findElement(By.xpath ("//div[contains(text(),' Choose date ')][1]")).click();
	}
	public void ClickReturnDate() {
		DriverFactory.getDriver().findElement(By.xpath ("//div[contains(text(),' Choose date ')][2]")).click();
	}
	public void SetDate(String Date) {
		DriverFactory.getDriver().findElement(By.xpath ("//div[@data-id='"+ Date +"']")).click();
	}
	public void SetMonth (String Month) {
		DriverFactory.getDriver().findElement(By.xpath ("//div[contains(text(),'"+Month+"')][1]")).click();
	}
	public void ClickPassenger() {
		DriverFactory.getDriver().findElement(By.xpath ("//div[contains(text(),'1 Adult')][1]")).click();	
	}
	public void SetNumberPassengerAdult() {
		DriverFactory.getDriver().findElement(By.xpath ("(//div[@data-ref='counter.counter__increment'])[1]")).click();

	}
	public void SetNumberPassengerChild() {
	 DriverFactory.getDriver().findElement(By.xpath ("(//div[@data-ref='counter.counter__increment'])[3]")).click();
	}
	public void ClickButtonSearch() {
		DriverFactory.getDriver().findElement(By.xpath ("//button[@aria-label='Search']")).click();
	}



}
