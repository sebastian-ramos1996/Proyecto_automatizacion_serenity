/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HogarPage {

    public static final Target COLCHONES_BASE_CAMAS_BUTTON = Target.the("colchones_base_camas_button")
            .located(By.xpath("//img[@title='Colchones y Base Cama']"));
    public static final Target COLCHONES_BUTTON = Target.the("colchones_button")
            .located(By.xpath("//img[@alt='Firmeza']"));
    public static final Target PRODUCTO_BUTTON = Target.the("producto_button")
            .located(By.xpath("//img[@alt='Super Mega Combo Azul Queen 160x190 Resortado Marshall']"));

}
