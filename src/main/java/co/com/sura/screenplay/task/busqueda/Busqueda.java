package co.com.sura.screenplay.task.busqueda;


import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.ManagerLog;
import co.com.sura.screenplay.helpers.Time;
import co.com.sura.screenplay.helpers.Utils;
import co.com.sura.screenplay.ui.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static co.com.sura.screenplay.ui.despacho.BusquedaProductoPage.*;
import static co.com.sura.screenplay.ui.home.HomePage.*;
import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Busqueda implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        String nombreProducto = /**Utils.generarNombreDelProductoParaBusqueda().get(0); */ "Celulares";
        actor.attemptsTo(WaitUntil.the(INPUT_CAMPO_BUSQUEDA, isVisible()).forNoMoreThan(Constant.SHORT).seconds(),
                Enter.theValue(nombreProducto).into(HomePage.INPUT_CAMPO_BUSQUEDA).thenHit(Keys.ENTER));

        if (BUTTON_ORDENAR_POR.isVisibleFor(actor)) {
            /**  Validacion Paginacion
             String textoCrearRegistro = Constant.TEXTO_PAG_CARGADA_NUMERO_PAGINAS;
             String validarPagCargada = actor.asksFor(Text.of(TEXT_NUMERO_PAGINAS));
             assertThat(textoCrearRegistro, containsString(validarPagCargada));
             */
            if (nombreProducto != null && nombreProducto.equals(Constant.PRODUCTO_ESPECIAL)) {
                int numeroRandomDelProductoEspecial = Utils.obtenerNumeroRandonParaSeleccionarUnProductoEspecial();
                String xpathEspecialRandom = Utils.armarLocalizadorRamdonCantidadProductoEspecial(numeroRandomDelProductoEspecial);
                Time.waiting(Constant.SHORT);
                actor.attemptsTo(Click.on(xpathEspecialRandom));

            } else {
                int numeroRandomDelProducto = Utils.obtenerNumeroRandonParaSeleccionarUnProducto();
                String xpathRandom = Utils.armarLocalizadorRamdonCantidadProducto(numeroRandomDelProducto);
                Time.waiting(Constant.SHORT);
                WebElement moveToMouse = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(org.openqa.selenium.By.xpath(xpathRandom));
                new Actions(BrowseTheWeb.as(theActorInTheSpotlight()).getDriver())
                        .moveToElement(moveToMouse)
                        .perform();
                Time.waiting(Constant.SHORT);
                actor.attemptsTo(Click.on(xpathRandom));
                Time.waiting(Constant.SHORT);
                /** String textoSeguirComprando = Constant.TEXTO_PAG_CARGADA_SEGUIR_COMPRANDO;
                 String validarPagCargada = actor.asksFor(Text.of(TEXT_SEGUIR_COMPRANDO));
                 if (validarPagCargada != null && validarPagCargada.equals(textoSeguirComprando)){
                 actor.attemptsTo(Click.on(BUTTON_AGREGAR_BOLSA));
                 actor.attemptsTo(Click.on(BUTTON_VER_BOLSA_COMPRAS));
                 }else{
                 actor.attemptsTo(Click.on(xpathRandom));
                 }
                 */
            }
            actor.attemptsTo(WaitUntil.the(BUTTON_AGREGAR_BOLSA, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                    Click.on(BUTTON_AGREGAR_BOLSA));
            actor.attemptsTo(WaitUntil.the(BUTTON_VER_BOLSA_COMPRAS, isVisible()).forNoMoreThan(Constant.INTERMEDIATE).seconds(),
                    Click.on(BUTTON_VER_BOLSA_COMPRAS));

        } else {
            String txt = actor.asksFor(Text.of(TEXT_NO_HAY_RESULTADOS));
            if (txt != null && txt.equals(Constant.TEXTO_PAG_CARGADA_NO_ENCUENTRA_RESULTADOS + " " + "'" + nombreProducto + "'")) {
                ManagerLog.imprimirExito("" + Constant.EL_USUARIO + " " + "realizo la busqueda del producto de preferencia, PERO NO se encontraron resultados");
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().quit();
            }
        }
    }

    public static Performable busquedaProductos() {
        return Tasks.instrumented(Busqueda.class);
    }
}
