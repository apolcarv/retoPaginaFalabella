package co.com.sura.screenplay.ui.despacho;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DespachoPage extends PageObject {

    public static final Target TXT_PAGINA_DESPACHO = Target.the(""+ Constant.EL_USUARIO + " "+"valida que este en la pagina de despacho")
            .located(By.xpath("//h2[text()='Elige tus opciones de despacho']"));

    public static final Target LISTDOWN_DEPARTAMENTO = Target.the(""+ Constant.EL_USUARIO + " "+"despliega la lista de departamentos")
            .located(By.xpath("//select[@id='region']"));

    public static final Target LISTDOWN_CIUDAD = Target.the(""+ Constant.EL_USUARIO + " "+"despliega la lista de ciudad")
            .located(By.xpath("//select[@id='ciudad']"));

    public static final Target LISTDOWN_BARRIO = Target.the(""+ Constant.EL_USUARIO + " "+"despliega la lista de ciudad")
            .located(By.xpath("//select[@id='comuna']"));

    public static final Target BUTTON_CONTINUAR= Target.the(""+ Constant.EL_USUARIO + " "+"da clic en el boton continuar")
            .located(By.xpath("//div[@class='fbra_formItem fbra_formItem--Button fbra_input--field04']//button[text()='Continuar']"));

    public static final Target TXT_DIRECCION = Target.the(""+ Constant.EL_USUARIO + " "+"verifica que este el texto correspondiente")
            .located(By.xpath("//span[text()='Dirección']"));

    public static final Target INPUT_DIRECCION = Target.the(""+ Constant.EL_USUARIO + " "+"ingresa la direccion")
            .located(By.xpath("//input[@id='address']"));

    public static final Target INPUT_TIPO_PREDIO = Target.the(""+ Constant.EL_USUARIO + " "+"ingresa el tipo de predio")
            .located(By.xpath("//input[@id='departmentNumber']"));

    public static final Target BUTTON_INGRESAR_DIRECCION= Target.the(""+ Constant.EL_USUARIO + " "+"da clic en el boton continuar")
            .located(By.xpath("//button[text()='Ingresar dirección']"));

    public static final Target TXT_IR_A_PAGAR = Target.the(""+ Constant.EL_USUARIO + " "+"verifica que este el texto correspondiente")
            .located(By.xpath("//h1[text()='Ir a pagar']"));

    public static final Target BUTTON_CONTINUAR_IR_A_PAGAR = Target.the(""+ Constant.EL_USUARIO + " "+"da clic en el boton continuar para ir a pagar")
            .located(By.xpath("//button[text()='Continuar']"));

    private static List<WebElement> obtenerlocalizadorDepartamento() {
        String xpath =  "//select[@id='region']//option";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(org.openqa.selenium.By.xpath(xpath));
    }

    public static List<WebElement> getObtenerlocalizadorDepartamento() {
        return obtenerlocalizadorDepartamento();
    }

    private static List<WebElement> obtenerlocalizadorCiudad() {
        String xpath = "//select[@id='ciudad']//option";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(org.openqa.selenium.By.xpath(xpath));
    }
    public static List<WebElement> getObtenerlocalizadorCiudad(){
        return obtenerlocalizadorCiudad();
    }

    private static List<WebElement> obtenerlocalizadorBarrio() {
        String xpath =  "//select[@id='comuna']//option";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(org.openqa.selenium.By.xpath(xpath));
    }

    public static List<WebElement> getObtenerlocalizadorBarrio() {
        return obtenerlocalizadorBarrio();
    }





}
