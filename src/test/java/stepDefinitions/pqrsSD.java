package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.pqrsSteps;

public class pqrsSD {
    @Steps
    pqrsSteps steps;

    @Given("el cliente ingresa al portal web de la empresa y luego al modulo contactenos")
    public void elClienteIngresaAlPortalWebDeLaEmpresaYLuegoAlModuloContactenos() {
        steps.ingresarChoucair();
        steps.ingresarContactenos();
    }

    @And("despues al boton PQRS")
    public void despuesAlBotonPQRS() {
        steps.ingresarPQRS();
    }

    @And("no completa ningun campo del formulario")
    public void noCompletaNingunCampoDelFormulario() {
        steps.noIngresarDatos();
    }

    @And("presiona el boton ENVIAR")
    public void presionaElBotonENVIAR() {
        steps.presionarEnviar();
    }

    @Then("obtendra un mensaje de error")
    public void obtendraUnMensajeDeError() {
        steps.validarMensajeError();
    }

}
