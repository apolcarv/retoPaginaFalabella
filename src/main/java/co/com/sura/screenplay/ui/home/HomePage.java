package co.com.sura.screenplay.ui.home;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {

    public static final Target IMG_LOGO_FALABELLA = Target.the("" + Constant.EL_USUARIO + " " + "realiza validacion del logo de falabella")
            .located(By.xpath("//img[@class='Logo-module_logo__3RERy']"));

    public static final Target INPUT_CAMPO_BUSQUEDA = Target.the("" + Constant.EL_USUARIO + " " + "inserta el criterio de preferencia de busqueda")
            .located(By.id("testId-SearchBar-Input"));

    public static final Target BUTTON_ORDENAR_POR = Target.the("" + Constant.EL_USUARIO + " " + "boton para odenar los productos por:")
            .located(By.id("testId-Dropdown-desktop-button"));

    public static final Target BUTTON_AGREGAR_BOLSA = Target.the("" + Constant.EL_USUARIO + " " + "selecciona cualquier cantidad de producto agregando a la bolsa o al carrito")
            .located(By.xpath("//button[contains(@class,'button button-primary')]"));

    public static final Target BUTTON_VER_BOLSA_COMPRAS = Target.the("" + Constant.EL_USUARIO + " " + "pulsa el boton ver bolsa de compras para redirigirla al carrito de compras")
            .located(By.id("linkButton"));

}
