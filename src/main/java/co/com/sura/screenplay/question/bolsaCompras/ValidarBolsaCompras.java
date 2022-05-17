package co.com.sura.screenplay.question.bolsaCompras;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.bolsaCompras.BolsaDeComprasPage.TXT_PAGINA_BOLSA_COMPRAS;


public class ValidarBolsaCompras implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_PAGINA_BOLSA_COMPRAS, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_CARGADA_BOLSA_COMPRAS))
                .forNoMoreThan(Constant.MIDDLE).seconds());
        return true;
    }
    public static ValidarBolsaCompras estoyEnlaBolsaDeCompras(){
        return new ValidarBolsaCompras();
    }
}
