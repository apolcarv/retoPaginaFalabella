package co.com.sura.screenplay.ui.pago;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagosUI extends PageObject {

    public static final Target TXT_ELIGE_MEDIO_PAGO = Target.the("" + Constant.EL_USUARIO + " " + "valida que este en la pagina de pagos")
            .located(By.xpath("//h2[text()='Elige tu medio de pago']"));
}
