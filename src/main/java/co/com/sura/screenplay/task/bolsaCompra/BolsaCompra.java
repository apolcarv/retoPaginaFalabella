package co.com.sura.screenplay.task.bolsaCompra;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import static co.com.sura.screenplay.ui.bolsaCompras.BolsaDeComprasPage.BUTTON_IR_A_COMPRAR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BolsaCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String cantidadDeProductosEnlaBolsa = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(By.xpath("//span[@class='count-number count notranslate']")).getText();
        cantidadDeProductosEnlaBolsa.replaceAll("\\(","");
        actor.attemptsTo(WaitUntil.the(BUTTON_IR_A_COMPRAR, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(BUTTON_IR_A_COMPRAR));

    }
    public static Performable irAComprar(){
        return Tasks.instrumented(BolsaCompra.class);
    }
}
