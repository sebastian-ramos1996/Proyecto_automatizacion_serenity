package co.com.tcs.proyectoautomatizacionserenity.tasks;

import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.HogarPage;
import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.IndexPage;
import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexPage.CATEGORIA_BUTTON),
                Click.on(IndexPage.HOGAR_BUTTON),
                Click.on(HogarPage.COLCHONES_BASE_CAMAS_BUTTON),
                Click.on(HogarPage.COLCHONES_BUTTON),
                Click.on(HogarPage.PRODUCTO_BUTTON),
                Click.on(ProductoPage.CANTIDAD_BUTTON),
                Click.on(ProductoPage.VALOR_CANTIDAD_BUTTON),
                Click.on(ProductoPage.ANIADIR_BUTTON),
                Click.on(ProductoPage.IR_CARRITO_BUTTON));

    }
}
