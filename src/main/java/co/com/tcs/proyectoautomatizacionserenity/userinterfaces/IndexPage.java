/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage {
    public static final Target CATEGORIA_BUTTON = Target.the("categoria_button")
            .located(By.xpath("//div[@class='icon icon-hamburger']"));
    public static final Target HOGAR_BUTTON = Target.the("hogar_button")
            .located(By.xpath("//span[text()=\"Hogar\"]"));

}
