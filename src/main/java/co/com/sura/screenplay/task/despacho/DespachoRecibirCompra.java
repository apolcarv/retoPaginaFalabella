package co.com.sura.screenplay.task.despacho;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.despacho.DespechoPage.BUTTON_CONTINUAR_IR_A_PAGAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DespachoRecibirCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BUTTON_CONTINUAR_IR_A_PAGAR, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(BUTTON_CONTINUAR_IR_A_PAGAR));
    }
    public static Performable continuarIrAPagar(){
        return Tasks.instrumented(DespachoRecibirCompra.class);
    }
}
