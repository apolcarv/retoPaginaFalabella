package co.com.sura.screenplay.ui.despacho;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaProductoPage extends PageObject {


    public static final Target TEXT_NO_HAY_RESULTADOS = Target.the("" + Constant.EL_USUARIO + " " + "Obtiene el texto no se encontraron resultados")
            .located(By.xpath("//h3[text()='Lo sentimos, no encontramos resultados para']"));

    public static final Target TEXT_NUMERO_PAGINAS = Target.the("" + Constant.EL_USUARIO + " " + "Obtiene el texto del numero de paginas")
            .located(By.xpath("//div[@class='jsx-2245223747 action-bar--item']//span[text()='Páginas']"));

    public static final Target TEXT_SEGUIR_COMPRANDO = Target.the("" + Constant.EL_USUARIO + " " + "Obtiene el texto seguir comprando")
            .located(By.xpath("//button[text()='Seguir comprando']"));


    private static List<WebElement> obtenerlocalizadorList() {
        String xpath = "//div[@class='jsx-4001457643 search-results-4-grid grid-pod']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    private static List<WebElement> obtenerlocalizadorEspecialList() {
        String xpath ="//div[@class='jsx-4001457643 search-results-list']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static  List<WebElement> getObtenerlocalizadorList(){
        return obtenerlocalizadorList();
    }

    public static List<WebElement> getObtenerlocalizadorEspecialList() {
        return  obtenerlocalizadorEspecialList();
    }


}
