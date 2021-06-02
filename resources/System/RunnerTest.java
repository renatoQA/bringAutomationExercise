package System;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * This class is the main feature execution class and output configuration
 */
@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin = { "pretty" }, 										
		features = ".\\resources\\Features",                         
		glue = "classpath:cucumberLogic", 										   							
		monochrome = true, 									       				 	     	
		publish = true
		) 

public class RunnerTest {

}