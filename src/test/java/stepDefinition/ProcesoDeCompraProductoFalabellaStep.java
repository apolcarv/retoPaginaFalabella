package stepDefinition;

import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.TestInfo;
import co.com.sura.screenplay.question.bolsaCompras.ValidarBolsaCompras;
import co.com.sura.screenplay.question.despacho.ValidaDespachoDirecciones;
import co.com.sura.screenplay.question.despacho.ValidarDespacho;
import co.com.sura.screenplay.question.home.ValidarHome;
import co.com.sura.screenplay.question.pago.ValidaPaginaPagos;
import co.com.sura.screenplay.task.busqueda.Busqueda;
import co.com.sura.screenplay.task.abrirNavegadorWeb.Abrir;
import co.com.sura.screenplay.task.bolsaCompra.BolsaCompra;
import co.com.sura.screenplay.task.despacho.Despacho;
import co.com.sura.screenplay.task.despacho.DespachoDirecciones;
import co.com.sura.screenplay.task.despacho.DespachoRecibirCompra;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProcesoDeCompraProductoFalabellaStep {


    private TestInfo testInfo;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa al portal de falabella colombia para la compra de un producto {string} {string}")
    public void queElUsuarioIngresaAlPortalDeFalabellaColombiaParaLaCompraDeUnProducto(String escenario, String funcionalidad) {
        TestInfo testInfo = new TestInfo(escenario,funcionalidad);
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Abrir.navegadorWebURL());
       /**  theActorCalled(Constant.MR_ROBOT).attemptsTo(PopUp.CerrarPopUp()); */
        theActorInTheSpotlight().should(seeThat(ValidarHome.validarLogoFalabella()));

    }

    @Cuando("realiza busqueda de un producto de preferencia realizando compra y proceso de compra")
    public void realizaBusquedaDeUnProductoDePreferenciaRealizandoCompraYProcesoDeCompra() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Busqueda.busquedaProductos());
        theActorInTheSpotlight().should(seeThat(ValidarBolsaCompras.estoyEnlaBolsaDeCompras()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(BolsaCompra.irAComprar());
        theActorInTheSpotlight().should(seeThat(ValidarDespacho.estoyEnlaPaginaDespacho()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Despacho.eligeOpcionesDeDespacho());
        theActorInTheSpotlight().should(seeThat(ValidaDespachoDirecciones.estoyEnlaPaginaDespachoDirecciones()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(DespachoDirecciones.llenaelFRMdeLaDireccion());
        theActorInTheSpotlight().should(seeThat(ValidaDespachoDirecciones.estoyEnlaPaginaDespachoDirecciones()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(DespachoRecibirCompra.continuarIrAPagar());

    }
    @Entonces("el usuario llega hasta el final de la compra del producto")
    public void elUsuarioLlegaHastaElFinalDeLaCompraDelProducto() {
        theActorInTheSpotlight().should(seeThat(ValidaPaginaPagos.estoyPaginaDePagos()));
    }



}
