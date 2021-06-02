package cucumberLogic;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import System.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks  {

	@Before
	public void beforeEach() throws MalformedURLException {

	}
	@After
	public void after() {
		DriverFactory.killDriver();
	}

}
