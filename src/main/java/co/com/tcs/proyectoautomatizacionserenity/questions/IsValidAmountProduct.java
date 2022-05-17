/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.questions;

import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsValidAmountProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CarritoPage.PRODUCT_CANTIDAD.resolveAllFor(actor).get(0).getText();
    }

    public static IsValidAmountProduct isValidAmountOfProductSelection(){
        return new IsValidAmountProduct();
    }
}
