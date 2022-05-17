package co.com.sura.screenplay.task.despacho;

import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.Utils;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.Locale;
import java.util.Random;
import static co.com.sura.screenplay.ui.despacho.DespechoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DespachoDirecciones implements Task {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    @Override
    public <T extends Actor> void performAs(T actor) {
        String direccion = ""+Utils.generarTipoDeDirecciones().get(0)+" "+faker.number().numberBetween(1,99)+" "+"#"+" "+faker.number().numberBetween(1,99)+" - "+faker.number().numberBetween(1,99)+"";
        actor.attemptsTo(WaitUntil.the(INPUT_DIRECCION, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Enter.theValue(direccion).into(INPUT_DIRECCION));
        String tipoPropiedad = Utils.generarTipoDePropiedad().get(0);
        actor.attemptsTo(WaitUntil.the(INPUT_TIPO_PREDIO, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Enter.theValue(tipoPropiedad+" "+faker.number().digits(2)).into(INPUT_TIPO_PREDIO));
        actor.attemptsTo(WaitUntil.the(BUTTON_INGRESAR_DIRECCION, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                Click.on(BUTTON_INGRESAR_DIRECCION));
    }
    public static Performable llenaelFRMdeLaDireccion() {
        return Tasks.instrumented(DespachoDirecciones.class);
    }
}
