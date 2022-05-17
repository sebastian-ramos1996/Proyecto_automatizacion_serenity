package co.com.tcs.proyectoautomatizacionserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target PRODUCT_NAME = Target.the("product_name")
            .located(By.xpath("//a[text()=\"Super Mega Combo Azul Queen 160x190 Resortado Marshall\"]"));
    public static final Target PRODUCT_VALUE = Target.the("product_value")
            .located(By.xpath("//div[@class='price-main-md']"));
    public static final Target PRODUCT_CANTIDAD = Target.the("product_cantidad")
            .located(By.xpath("//select[@class='form-control form-control-sm ng-pristine ng-valid ng-not-empty ng-touched']"));
    public static final Target ELIMINAR_BUTTON = Target.the("eliminar_button")
            .located(By.xpath("//a[text()=\"Eliminar\"]"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("confirmartion_message")
            .located(By.xpath("//h2[text()=\"No tienes productos en tu carrito\"]"));
}
