package co.com.sura.screenplay.interaction;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionarProductoAleatorio implements Interaction {

    private Target list;
    //   private String opcionRandom;

    public SeleccionarProductoAleatorio(Target list) {
        this.list = list;
        //      this.opcionRandom = opcionRandom;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> litObjeto = list.resolveFor(actor).findElements(By.xpath("//div[@data-pod='catalyst-pod']"));
        for (int i = 0; i < litObjeto.size(); i++) {
            // if(litObjeto.get(i).getText().equals(opcionRandom)){
            litObjeto.get(i).click();
            break;
        }
 //   }

}
    public static SeleccionarProductoAleatorio productoRandom(Target list){
        return new SeleccionarProductoAleatorio(list);

    }
}
