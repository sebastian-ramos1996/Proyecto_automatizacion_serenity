package co.com.tcs.proyectoautomatizacionserenity.questions;

import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsValidValueProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return CarritoPage.PRODUCT_VALUE.resolveAllFor(actor).get(0).getText();
    }

    public static IsValidValueProduct IsValidValueOfProductSelection(){
        return new IsValidValueProduct();
    }
}
