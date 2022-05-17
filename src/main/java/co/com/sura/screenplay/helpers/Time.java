package co.com.sura.screenplay.helpers;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Time implements Interaction {

    private int segundos;
    public Time(int segundos) {
        this.segundos = segundos;
    }


    @Override
    @Step("{0} espera #segundos segundo(s) antes de ejecutar el siguiente paso")
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor((segundos * 1000));
    }
    public static Interaction seconds(int segundos) {
        return Tasks.instrumented(Time.class, segundos);
    }
}
