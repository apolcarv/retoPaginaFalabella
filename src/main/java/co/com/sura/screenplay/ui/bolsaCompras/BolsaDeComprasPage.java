package co.com.sura.screenplay.ui.bolsaCompras;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BolsaDeComprasPage extends PageObject {

    public static final Target TXT_PAGINA_BOLSA_COMPRAS = Target.the(""+ Constant.EL_USUARIO + " "+"valida que este en la pagina Bolsa de compras")
            .located(By.xpath("//div[@class='headerContainer']//span[text()='Bolsa de Compras']"));

    public static final Target BUTTON_IR_A_COMPRAR = Target.the(""+ Constant.EL_USUARIO + " "+"da clic en el boton ir a comprar")
            .located(By.xpath("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));


}
