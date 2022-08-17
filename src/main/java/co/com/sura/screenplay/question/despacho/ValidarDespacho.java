package co.com.sura.screenplay.question.despacho;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sura.screenplay.ui.despacho.DespachoPage.TXT_PAGINA_DESPACHO;

public class ValidarDespacho implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_PAGINA_DESPACHO, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_CARGADA_DESPACHO))
                .forNoMoreThan(Constant.MIDDLE).seconds());
        return true;
    }
    public static ValidarDespacho estoyEnlaPaginaDespacho(){
        return new ValidarDespacho();
    }
}
