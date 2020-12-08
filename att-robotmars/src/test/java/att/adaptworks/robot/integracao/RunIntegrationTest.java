package att.adaptworks.robot.integracao;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber/robot"},
	features={"src/test/resources/att/adaptworks/robot"})
public class RunIntegrationTest {
	
}
