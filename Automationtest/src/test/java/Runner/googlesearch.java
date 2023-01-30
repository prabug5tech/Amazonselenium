package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/loginfeature/Googlesearch.feature",glue= {"Flipkartlogin"},monochrome = true,
plugin ={"pretty","html:target/Htmlreports/report","json:target/Jsonreports/jsreport"})
public class googlesearch {

	
}
