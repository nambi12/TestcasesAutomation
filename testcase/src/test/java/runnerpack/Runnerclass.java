package runnerpack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import basepack.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featurefile/testcase.feature:339", 
    glue = "steppack", publish = true, tags = "", monochrome=true )

public class Runnerclass extends Baseclass{
	
@BeforeClass
	public static void start() {
		browserlaunch();
	}

	@AfterClass
	public static void end() {
		
	}
}
