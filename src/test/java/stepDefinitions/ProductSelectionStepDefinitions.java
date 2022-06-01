/**
 * @Autor: Jhon Sebastian Ramos Muñoz
 * */

package stepDefinitions;

import co.com.tcs.proyectoautomatizacionserenity.interactions.OpenBrowser;
import co.com.tcs.proyectoautomatizacionserenity.questions.IsValidAmountProduct;
import co.com.tcs.proyectoautomatizacionserenity.questions.IsValidClearCarrito;
import co.com.tcs.proyectoautomatizacionserenity.questions.IsValidNameProduct;
import co.com.tcs.proyectoautomatizacionserenity.questions.IsValidValueProduct;
import co.com.tcs.proyectoautomatizacionserenity.tasks.BorrarDelCarrito;
import co.com.tcs.proyectoautomatizacionserenity.tasks.SeleccionarProducto;
import co.com.tcs.proyectoautomatizacionserenity.userinterfaces.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProductSelectionStepDefinitions {

    LinioPage page;
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("sebastian");
    }

    @Given("^el usuario se encuentra en la aplicacion https://www\\.linio\\.com\\.co/$")
    public void elUsuarioSeEncuentraEnLaAplicacionHttpsWwwLinioComCo() {
        theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(page));
    }


    @When("^el usuario ingresa a la seccion colchones de la categoria Hogar y selecciona un producto con el carrito$")
    public void elUsuarioIngresaALaSeccionColchonesDeLaCategoriaHogarYSeleccionaUnProductoConElCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.seleccionDelProducto());

    }

    @Then("^el usuario ve el (.*), (.*) y (.*) en el carrito$")
    public void elUsuarioVeElSuperMegaComboAzulQueenXResortadoMarshallY$EnElCarrito(String producto, String cantidad, String valor) {
        theActorInTheSpotlight().should(seeThat(IsValidNameProduct.isValidNameOfProductSelection(),
                Matchers.equalTo(producto)));
        theActorInTheSpotlight().should(seeThat(IsValidValueProduct.IsValidValueOfProductSelection(),
                Matchers.equalTo(valor)));
        theActorInTheSpotlight().should(seeThat(IsValidAmountProduct.isValidAmountOfProductSelection(),
                Matchers.equalTo(cantidad)));

    }

    @When("^el usuario ingresa a la seccion colchones de la categoria Hogar, selecciona un producto con el carrito y despues lo elimina$")
    public void elUsuarioIngresaALaSeccionColchonesDeLaCategoriaHogarSeleccionaUnProductoConElCarritoYDespuesLoElimina() {
        theActorInTheSpotlight().attemptsTo(BorrarDelCarrito.borrarProductoDelCarrito());

    }

    @Then("^el usuario ve el mensaje (.*)$")
    public void elUsuarioVeElMensajeNOTIENESPRODUCTOSENTUCARRITO(String mensaje) {
        theActorInTheSpotlight().should(seeThat(IsValidClearCarrito.isValidMessageOfClearCarrito(),
                Matchers.equalTo(mensaje)));

    }
}
