package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/JarvisWS/FreeCRMProject.com/src/main/java/Features/login.feature",//path of the feature file
		glue={"stepDefinitions"},//package of step definitions file
		format={"pretty","html:test-output","json:json-output/login.json","junit:junit_xml/login.xml"},//to generate reports
		dryRun = true,//to check mapping is proper btw feature file and step def file
		monochrome = true,//display o/p in readable format
		strict = true//to check if the step is not defined in step def file 
		)




public class TestRunner {
	
}
