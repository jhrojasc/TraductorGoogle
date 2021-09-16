package traductor_Google.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import traductor_Google.model.GoogleTraslateData;
import traductor_Google.tasks.OpenUp;
import traductor_Google.tasks.Traducir;

import java.util.List;

public class GoogleTraductorStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Yeison quiere usar el traductor de google$")
    public void queYeisonQuiereUsarElTraductorDeGoogle(){
        OnStage.theActorCalled("Yeison").wasAbleTo(OpenUp.thePage());
    }

    @When("^el traduce una palabra de inglés a español$")
    public void elTraduceUnaPalabraDeInglésAEspañol(List<GoogleTraslateData> GoogletraslateData){
        OnStage.theActorInTheSpotlight().attemptsTo(Traducir.DeInglesAEspanol(GoogletraslateData));
    }

    @Then("^el deberia ver la palabra traducida del idioma origen a idioma destino$")
    public void elDeberiaVerLaPalabraTraducidaDelIdiomaOrigenAIdiomaDestino(DataTable arg1){
    }

}
