/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target PRODUCT_NAME = Target.the("product_name")
            .located(By.xpath("//a[text()=\"Super Mega Combo Azul Queen 160x190 Resortado Marshall\"]"));
    public static final Target PRODUCT_VALUE = Target.the("product_value")
            .located(By.xpath("//span[text()=\"$3.974.700\"]"));
    public static final Target PRODUCT_CANTIDAD = Target.the("product_cantidad")
            .located(By.xpath("//option[@selected='selected']"));
    public static final Target ELIMINAR_BUTTON = Target.the("eliminar_button")
            .located(By.xpath("//a[text()=\"Eliminar\"]"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("confirmartion_message")
            .located(By.xpath("//h2[text()=\"No tienes productos en tu carrito\"]"));
}
