package co.com.choucair.certification.proyectoprueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/youtube.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.proyectoprueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class RunnerTags {
}
