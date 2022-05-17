package co.com.sura.screenplay.task.popUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PopUp implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        Alert alert = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().switchTo().alert();
        alert.dismiss();
    }
    public static Performable CerrarPopUp () {
        return Tasks.instrumented(PopUp.class);
    }
}
