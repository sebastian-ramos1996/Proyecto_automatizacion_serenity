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

    @Given("^el usuario se encuentra en la aplicacion (.*)$")
    public void elUsuarioSeEncuentraEnLaAplicacionHttpsWwwLinioComCo() {
        theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(page));

    }

    @When("^el usuario ingresa a la seccion colchones de la categoria Hogar y selecciona un producto con el carrito$")
    public void elUsuarioIngresaALaSeccionColchonesDeLaCategoriaHogarYSeleccionaUnProductoConElCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.seleccionDelProducto());

    }

    @When("^el usuario elimina el producto seleccionado del carrito$")
    public void elUsuarioEliminaElProductoSeleccionadoDelCarrito() {
        theActorInTheSpotlight().attemptsTo(BorrarDelCarrito.borrarProducoDelCarrito());

    }

    @Then("^el usuario ve el Super (.*), (.*) y (.*) en el carrito$")
    public void elUsuarioVeElSuperMegaComboAzulQueenXResortadoMarshallY$EnElCarrito(String producto, String cantidad, String valor) {
        theActorInTheSpotlight().should(seeThat(IsValidNameProduct.isValidNameOfProductSelection(),
                Matchers.equalTo(producto)));
        theActorInTheSpotlight().should(seeThat(IsValidValueProduct.IsValidValueOfProductSelection(),
                Matchers.equalTo(valor)));
        theActorInTheSpotlight().should(seeThat(IsValidAmountProduct.isValidAmountOfProductSelection(),
                Matchers.equalTo(cantidad)));

    }

    @Then("^ve el mensaje (.*)$")
    public void veElMensajeNOTIENESPRODUCTOSENTUCARRITO(String mensaje) {
        theActorInTheSpotlight().should(seeThat(IsValidClearCarrito.isValidMessageOfClearCarrito(),
                Matchers.equalTo(mensaje)));

    }
}
