package co.com.sura.screenplay.question.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.sura.screenplay.ui.home.HomePage.IMG_LOGO_FALABELLA;


public class ValidarHome implements Question {
    @Override
    public Object answeredBy(Actor actor) {
   return IMG_LOGO_FALABELLA.resolveFor(actor).isDisplayed();
    }
    public static ValidarHome validarLogoFalabella(){
        return new ValidarHome();
    }
}
