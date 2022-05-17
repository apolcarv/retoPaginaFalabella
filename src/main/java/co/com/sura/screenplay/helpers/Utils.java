package co.com.sura.screenplay.helpers;


import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Utils {
    private static final String LOG_CLASE = "Utils -> ";
    private static final List<String> datosDeBusqueda = new ArrayList<>();
    private static final List<String> datosDirecciones = new ArrayList<>();
    private static final List<String> datotipoPropiedad = new ArrayList<>();
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    public static List<String> generarNombreDelProductoParaBusqueda() {
        datosDeBusqueda.add(faker.options().option("Tecnologia", "Celulares", "Electrodomesticos", "Muebles",
                "Dormitorio", "Decohogar", "Zapatos", "Deportes", "Mujer"));
        ManagerLog.imprimirExito(LOG_CLASE + "la generacion del nombre del producto para la busqueda se genero exitosamente");
        return datosDeBusqueda;
    }

    public static List<WebElement> obtenerlocalizadorList() {
        String xpath = Constant.LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_GENERAL;
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static int obtenerNumeroRandonParaSeleccionarUnProducto() {
        return faker.number().numberBetween(1, obtenerlocalizadorList().size());
    }

    public static String armarLocalizadorRamdonCantidadProducto(int numeroRandomDelProducto) {
        String xpathRandom = Constant.LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_SELECCIONANDO_PRODUCTO_PREFERENCIA+"["+numeroRandomDelProducto+"]";
     return xpathRandom;
    }

    public static List<WebElement> obtenerlocalizadorEspecialList() {
        String xpath = Constant.LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_ESPECIAL;
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static int obtenerNumeroRandonParaSeleccionarUnProductoEspecial() {
        return faker.number().numberBetween(2, obtenerlocalizadorEspecialList().size());
    }

    public static String armarLocalizadorRamdonCantidadProductoEspecial(int numeroRandomDelProductoEspecial) {
        String xpathEspecialRandom = Constant.LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_SELECCIONANDO_PRODUCTO_PREFERENCIA_ESPECIAL+"["+numeroRandomDelProductoEspecial+"]";
        return xpathEspecialRandom;
    }

    public static List<WebElement> obtenerlocalizadorDepartamento() {
        String xpath = Constant.LOCALIZADOR_SELECT_LISTDOWN_DEPARTAMENTO;
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static int obtenerNumeroRandonParaSeleccionarDepartamento( ) {
        return faker.number().numberBetween(2, obtenerlocalizadorDepartamento().size());
    }

    public static String armarLocalizadorRamdonDepartamento(int numeroRandomDelDepartamento) {
        String xpathRandom = Constant.LOCALIZADOR_SELECT_LISTDOWN_DEPARTAMENTO+"["+numeroRandomDelDepartamento+"]";
        return xpathRandom;
    }

    public static List<WebElement> obtenerlocalizadorCiudad() {
        String xpath = Constant.LOCALIZADOR_SELECT_LISTDOWN_CIUDAD;
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static int obtenerNumeroRandonParaSeleccionarCiudad() {
        return faker.number().numberBetween(2, obtenerlocalizadorCiudad().size());
    }

    public static String armarLocalizadorRamdonCiudad(int numeroRandomDelCiudad) {
        String xpathRandom = Constant.LOCALIZADOR_SELECT_LISTDOWN_CIUDAD+"["+numeroRandomDelCiudad+"]";
        return xpathRandom;
    }

    public static List<WebElement> obtenerlocalizadorBarrio() {
        String xpath = Constant.LOCALIZADOR_SELECT_LISTDOWN_BARRIO;
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static int obtenerNumeroRandonParaSeleccionarBarrio() {
        return faker.number().numberBetween(2, obtenerlocalizadorBarrio().size());
    }

    public static String armarLocalizadorRamdonBarrio(int numeroRandomDelBarrio) {
        String xpathRandom = Constant.LOCALIZADOR_SELECT_LISTDOWN_BARRIO+"["+numeroRandomDelBarrio+"]";
        return xpathRandom;
    }

    public static List<String> generarTipoDeDirecciones() {
        datosDirecciones.add(faker.options().option("CALLE", "CARRERA", "AVENIDA", "CIRCULAR","DIAGONALES", "TRANVERSALES", "PASAJE"));
        ManagerLog.imprimirExito(LOG_CLASE + "la generacion de la direccion  se genero exitosamente");
        return datosDirecciones;
    }

    public static List<String> generarTipoDePropiedad() {
        datotipoPropiedad.add(faker.options().option("Torre", "Apartamento", "Conjunto", "Oficina",
                "Condominio"));
        ManagerLog.imprimirExito(LOG_CLASE + "la generacion del tipo de propiedad se genero exitosamente");
        return datotipoPropiedad;
    }

}


