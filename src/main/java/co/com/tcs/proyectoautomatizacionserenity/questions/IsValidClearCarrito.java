/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package co.com.tcs.proyectoautomatizacionserenity.questions;

import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsValidClearCarrito implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String message = CarritoPage.CONFIRMATION_MESSAGE.resolveAllFor(actor).get(0).getText();
        System.out.println(message);
        return message;
    }

    public static IsValidClearCarrito isValidMessageOfClearCarrito(){
        return new IsValidClearCarrito();
    }
}
