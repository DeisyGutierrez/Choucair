package steps;

import pageObject.contactenos;

public class contactenosSteps {
    contactenos page;

    public void ingresarChocair() {
        page.open();
        page.cookiesBtn.waitUntilVisible();
        page.cookiesBtn.click();
    }

    public void ingresarContactenos() {
        page.contactenosBtn.waitUntilVisible();
        page.contactenosBtn.click();
    }

    public void completarFormulario() {
        page.temasDeInteresDropdown.waitUntilPresent();
        page.temasDeInteresDropdown.click();

        page.dropPrimeraOpcionBtn.waitUntilVisible();
        page.dropPrimeraOpcionBtn.click();

        page.nombreTxt.waitUntilVisible();
        page.nombreTxt.sendKeys("Deisy");

        page.apellidosTxt.waitUntilVisible();
        page.apellidosTxt.sendKeys("Gutierrez");

        page.correoElectronicoTxt.waitUntilVisible();
        page.correoElectronicoTxt.sendKeys("deisy@gmail.com");

        page.ciudadTxt.waitUntilVisible();
        page.ciudadTxt.sendKeys("Lima");

        page.empresaTxt.waitUntilVisible();
        page.empresaTxt.sendKeys("GKN");

        page.celularTxt.waitUntilVisible();
        page.celularTxt.sendKeys("999999999");

        page.mensajeTxt.waitUntilVisible();
        page.mensajeTxt.sendKeys("Hola como estas...");

        page.politicasCheckbox.waitUntilVisible();
        page.politicasCheckbox.click();

        page.enviarBtn.waitUntilVisible();
        page.enviarBtn.click();
    }

    public void validarMensaje() {
    }
}
