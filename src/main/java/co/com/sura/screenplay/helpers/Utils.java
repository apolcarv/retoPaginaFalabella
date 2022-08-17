package co.com.sura.screenplay.helpers;


import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import static co.com.sura.screenplay.ui.despacho.BusquedaProductoPage.getObtenerlocalizadorEspecialList;
import static co.com.sura.screenplay.ui.despacho.BusquedaProductoPage.getObtenerlocalizadorList;
import static co.com.sura.screenplay.ui.despacho.DespachoPage.*;


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

    public static int obtenerNumeroRandonParaSeleccionarUnProducto() {
        return faker.number().numberBetween(1, getObtenerlocalizadorList().size());
    }

    public static String armarLocalizadorRamdonCantidadProducto(int numeroRandomDelProducto) {
        String xpathRandom = "//div[@class='jsx-4001457643 search-results-4-grid grid-pod']"+"["+numeroRandomDelProducto+"]";
        return xpathRandom;
    }

    public static int obtenerNumeroRandonParaSeleccionarUnProductoEspecial() {
        return faker.number().numberBetween(2, getObtenerlocalizadorEspecialList().size());
    }

    public static String armarLocalizadorRamdonCantidadProductoEspecial(int numeroRandomDelProductoEspecial) {
        String xpathEspecialRandom = "//div[@class='jsx-4001457643 search-results-list']"+"["+numeroRandomDelProductoEspecial+"]";
        return xpathEspecialRandom;
    }

    public static int obtenerNumeroRandonParaSeleccionarDepartamento( ) {
        return faker.number().numberBetween(2, getObtenerlocalizadorDepartamento().size());
    }

    public static String armarLocalizadorRamdonDepartamento(int numeroRandomDelDepartamento) {
        String xpathRandom = "//select[@id='region']//option"+"["+numeroRandomDelDepartamento+"]";
        return xpathRandom;
    }

    public static int obtenerNumeroRandonParaSeleccionarCiudad() {
        return faker.number().numberBetween(2, getObtenerlocalizadorCiudad().size());
    }

    public static String armarLocalizadorRamdonCiudad(int numeroRandomDelCiudad) {
        String xpathRandom ="//select[@id='ciudad']//option"+"["+numeroRandomDelCiudad+"]";
        return xpathRandom;
    }


    public static int obtenerNumeroRandonParaSeleccionarBarrio() {
        return faker.number().numberBetween(2, getObtenerlocalizadorBarrio().size());
    }

    public static String armarLocalizadorRamdonBarrio(int numeroRandomDelBarrio) {
        String xpathRandom = "//select[@id='comuna']//option"+"["+numeroRandomDelBarrio+"]";
        return xpathRandom;
    }

    public static List<String> generarTipoDeDirecciones() {
        datosDirecciones.add(faker.options().option("CALLE", "CARRERA", "AVENIDA", "CIRCULAR","DIAGONALES", "TRANVERSALES", "PASAJE"));
        ManagerLog.imprimirExito(LOG_CLASE + "la generacion de la direccion  se genero exitosamente");
        return datosDirecciones;
    }

    public static List<String> generarTipoDePropiedad() {
        datotipoPropiedad.add(faker.options().option("Torre", "Apartamento", "Conjunto", "Oficina", "Condominio"));
        ManagerLog.imprimirExito(LOG_CLASE + "la generacion del tipo de propiedad se genero exitosamente");
        return datotipoPropiedad;
    }

}


