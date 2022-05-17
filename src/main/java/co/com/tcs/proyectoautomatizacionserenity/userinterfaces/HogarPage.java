package co.com.tcs.proyectoautomatizacionserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HogarPage {

    public static final Target COLCHONES_BASE_CAMAS_BUTTON = Target.the("colchones_base_camas_button")
            .located(By.xpath("//span[text()=\"Colchones, base cama y almohadas\"]"));
    public static final Target COLCHONES_BUTTON = Target.the("colchones_button")
            .located(By.xpath("//span[text()=\"Colchones\"]"));
    public static final Target PRODUCTO_BUTTON = Target.the("producto_button")
            .located(By.xpath("//span[text()=\"Super Mega Combo Azul Queen 160x190 Reso...\"]"));

}
