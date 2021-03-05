package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.contactenosSteps;

public class contactenosSD {
    @Steps
    contactenosSteps steps;


    @Given("el cliente ingresa al portal web de Choucair y luego al modulo contactenos")
    public void elClienteIngresaAlPortalWebDeChoucairYLuegoAlModuloContactenos() {
        steps.ingresarChocair();
        steps.ingresarContactenos();
    }

    @Then("obtendra un mensaje correcto")
    public void obtendraUnMensajeCorrecto() {
        steps.validarMensaje();
    }

    @And("completa el formulario y presiona ENVIAR")
    public void completaElFormularioYPresionaENVIAR() {
        steps.completarFormulario();
    }
}
