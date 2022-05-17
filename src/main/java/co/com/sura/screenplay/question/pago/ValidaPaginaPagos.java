package co.com.sura.screenplay.question.pago;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.pago.PagosUI.TXT_ELIGE_MEDIO_PAGO;

public class ValidaPaginaPagos implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_ELIGE_MEDIO_PAGO, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_CARGADA_PAGINA_PAGOS))
                .forNoMoreThan(Constant.MIDDLE).seconds());
        return true;
    }
    public static ValidaPaginaPagos estoyPaginaDePagos(){
        return new ValidaPaginaPagos();
    }
}
