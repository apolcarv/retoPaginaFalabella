package co.com.sura.screenplay.task.despacho;


import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sura.screenplay.ui.despacho.DespachoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Despacho implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LISTDOWN_DEPARTAMENTO, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(LISTDOWN_DEPARTAMENTO));
        int numeroRandomDepartamento = Utils.obtenerNumeroRandonParaSeleccionarDepartamento();
        String xpathRandomSeleccionarDepartamento = Utils.armarLocalizadorRamdonDepartamento(numeroRandomDepartamento);
        actor.attemptsTo(Click.on(xpathRandomSeleccionarDepartamento));
        actor.attemptsTo(WaitUntil.the(LISTDOWN_CIUDAD, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(LISTDOWN_CIUDAD));
        int numeroRandomCiudad = Utils.obtenerNumeroRandonParaSeleccionarCiudad();
        String xpathRandomSeleccionarCiudad = Utils.armarLocalizadorRamdonCiudad(numeroRandomCiudad);
        actor.attemptsTo(Click.on(xpathRandomSeleccionarCiudad));
        actor.attemptsTo(WaitUntil.the(LISTDOWN_BARRIO, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(LISTDOWN_BARRIO));
        int numeroRandomBarrio = Utils.obtenerNumeroRandonParaSeleccionarBarrio();
        String xpathRandomSeleccionarBarrio = Utils.armarLocalizadorRamdonBarrio(numeroRandomBarrio);
        actor.attemptsTo(Click.on(xpathRandomSeleccionarBarrio));
        actor.attemptsTo(WaitUntil.the(BUTTON_CONTINUAR, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(BUTTON_CONTINUAR));
    }

    public static Performable eligeOpcionesDeDespacho() {
        return Tasks.instrumented(Despacho.class);
    }
}
