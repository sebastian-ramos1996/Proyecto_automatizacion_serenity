/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.questions;

import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsValidValueProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String valorProducto=CarritoPage.PRODUCT_VALUE.resolveAllFor(actor).get(0).getText();
        System.out.println(valorProducto);
        return valorProducto;
    }

    public static IsValidValueProduct IsValidValueOfProductSelection(){
        return new IsValidValueProduct();
    }
}
