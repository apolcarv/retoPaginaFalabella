package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/procesoDeCompraProductoFalabella.feature"}
        , glue = {"stepDefinition"}
        , tags = "@Compra_exitosa"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class TestRunnerProcesoDeCompraProductoFalabella {
}
