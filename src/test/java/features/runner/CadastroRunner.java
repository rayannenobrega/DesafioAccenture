package features.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/cadastro/"},
        glue = {"stepDefinitions", "CadastroSteps"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/cucumber.json"
        }
)

public class CadastroRunner {
}
