package gmail_gluecode;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\bindu\\gmail_test\\src\\test\\resources\\feature\\feature1.feature",
		                   "D:\\bindu\\gmail_test\\src\\test\\resources\\feature\\feature2.feature"
		                   },
			
                 monochrome=true,
                 plugin= {"pretty","html:target\\result2"}
                 
                 )
                     
public class Runnerclass {

}
