/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {
    public static final Target CANTIDAD_BUTTON = Target.the("cantidad_button")
            .located(By.xpath("//button[@class='form-control form-control-lg select-dropdown-button select-dropdown-button-product-quantity hidden-sm-down d-none d-md-block']"));
    public static final Target VALOR_CANTIDAD_BUTTON = Target.the("valor_cantidad_button")
            .located(By.xpath("//li[text()=\"3\"]"));
    public static final Target ANIADIR_BUTTON = Target.the("aniadir_button")
            .located(By.xpath("//button[@id='buy-now']"));
    public static final Target IR_CARRITO_BUTTON = Target.the("ir_carrito_button")
            .located(By.xpath("//a[text()=\"Ir al carrito\"]"));
}
