package traductor_Google.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/traductor_google_datadriven.feature",
        tags = "@traducir",
        glue = "traductor_Google.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
