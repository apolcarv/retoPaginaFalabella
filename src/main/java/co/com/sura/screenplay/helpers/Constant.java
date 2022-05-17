package co.com.sura.screenplay.helpers;

import co.com.sura.screenplay.task.popUp.PopUp;

public class Constant {

    /** SCREENPLAY */
    public static final String MR_ROBOT = "Elliot Alderson";
    public static final String EL_USUARIO = "El usuario";
    public static final String PAGINA_WEB_URL_AUTOMATION_PRACTICE = "environments.default.webdriver.base.url";

    /** TIEMPOS_DE_ESPERAS */
    public static final int LONG = 60;
    public static final int MIDDLE = 20;
    public static final int INTERMEDIATE = 10;
    public static final int SHORT = 5;

    /** LOCALIZADORES */
    public static final String LOCALIZADOR_TEXTO_PAG_CARGADA_NO_ENCUENTRA_RESULTADOS = "//h3[text()='Lo sentimos, no encontramos resultados para']";
    public static final String LOCALIZADOR_TEXTO_PAG_CARGADA_NUMERO_PAGINAS = "//div[@class='jsx-2245223747 action-bar--item']//span[text()='Páginas']";
    public static final String LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_ESPECIAL = "//div[@class='jsx-4001457643 search-results-list']";
    public static final String LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_GENERAL = "//div[@class='jsx-4001457643 search-results-4-grid grid-pod']";
    public static final String LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_SELECCIONANDO_PRODUCTO_PREFERENCIA = "//div[@class='jsx-4001457643 search-results-4-grid grid-pod']";
    public static final String LOCALIZADOR_TIPOLIST_DATA_POD_CANTIDAD_PRODUCTOS_SELECCIONANDO_PRODUCTO_PREFERENCIA_ESPECIAL = "//div[@class='jsx-4001457643 search-results-list']";
    public static final String LOCALIZADOR_TEXTO_PAG_CARGADA_CANTIDAD_DE_PRODUCTOS_EN_LA_BOLSA = "//span[@class='count-number count notranslate']";

    public static final String LOCALIZADOR_SELECT_LISTDOWN_DEPARTAMENTO = "//select[@id='region']//option";
    public static final String LOCALIZADOR_SELECT_LISTDOWN_CIUDAD = "//select[@id='ciudad']//option";
    public static final String LOCALIZADOR_SELECT_LISTDOWN_BARRIO = "//select[@id='comuna']//option";

    public static final String LOCALIZADOR_TEXTO_PAG_CARGADA_SEGUIR_COMPRANDO = "//button[text()='Seguir comprando']";


    /** TEXTO ESPERADOS A VALIDAR */
    public static final String TEXTO_PAG_CARGADA_NO_ENCUENTRA_RESULTADOS = "Lo sentimos, no encontramos resultados para";
    public static final String TEXTO_PAG_CARGADA_NUMERO_PAGINAS = "Páginas:";
    public static final String TEXTO_PAG_CARGADA_BOLSA_COMPRAS = "Bolsa de Compras";
    public static final String TEXTO_PAG_CARGADA_DESPACHO = "Elige tus opciones de despacho";
    public static final String TEXTO_PAG_CARGADA_SEGUIR_COMPRANDO = "Seguir comprando";
    public static final String TEXTO_PAG_CARGADA_DESPACHO_DIRECCION = "Dirección";
    public static final String TEXTO_PAG_CARGADA_DESPACHO_IR_A_PAGAR = "Ir a pagar";
    public static final String TEXTO_PAG_CARGADA_PAGINA_PAGOS = "Elige tu medio de pago";



    /** PALABRA_ESPECIAL */
    public static final String PRODUCTO_ESPECIAL = "Celulares";
}
