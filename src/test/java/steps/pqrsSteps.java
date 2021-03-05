package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pageObject.pqrs;

public class pqrsSteps {
    pqrs pageObject;

    public void ingresarChoucair() {
        pageObject.open();
        pageObject.cookiesBtn.waitUntilVisible();
        pageObject.cookiesBtn.click();
    }

    public void ingresarContactenos() {
        pageObject.contactenosBtn.waitUntilVisible();
        pageObject.contactenosBtn.click();
    }

    public void ingresarPQRS() {
//        ((JavascriptExecutor) pageObject.getDriver()).executeScript("arguments[0].scrollIntoView(false);", pageObject.enviarPQRSBtn);
//        try {Thread.sleep(5000);} catch (InterruptedException e){ e.printStackTrace();}
        pageObject.enviarPQRSBtn.waitUntilVisible();
        pageObject.enviarPQRSBtn.click();
    }

    public void noIngresarDatos() {
        pageObject.politicasCheckbox.waitUntilVisible();
        pageObject.politicasCheckbox.waitUntilPresent();
        ((JavascriptExecutor) pageObject.getDriver()).executeScript("arguments[0].scrollIntoView(true);", pageObject.politicasCheckbox);
    }

    public void presionarEnviar() {
        pageObject.enviarBtn.waitUntilVisible();
        pageObject.enviarBtn.click();
    }

    public void validarMensajeError() {
        pageObject.mensajeErrorLabel.waitUntilVisible();
        pageObject.mensajeErrorLabel.shouldBeVisible();
    }

}
