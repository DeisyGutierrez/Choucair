package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.choucairtesting.com/")

public class pqrs extends PageObject {
    @FindBy(xpath = "//*[@id=\"cookie_action_close_header\"]")
    public WebElementFacade cookiesBtn;

    @FindBy(xpath = "//*[@id=\"menu-item-282\"]/a")
    public WebElementFacade contactenosBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div/section[6]/div/div/div/div/div/div/div/div/a/span/span")
    public WebElementFacade enviarPQRSBtn;

    @FindBy(xpath = "//*[@id=\"d5a52985-66b2-ea11-a812-000d3ac166cd\"]")
    public WebElementFacade temasDeInteresDropdown;

    @FindBy(xpath = "//*[@id=\"3f746946-34b4-442c-a677-e232cdd2bc40\"]")
    public WebElementFacade nombreTxt;

    @FindBy(xpath = "//*[@id=\"e1dfc514-f301-4cb2-855a-4c8fa8331207\"]")
    public WebElementFacade apellidosTxt;

    @FindBy(xpath = "//*[@id=\"7f685ebb-7c54-4cff-a1bc-772562d25c38\"]")
    public WebElementFacade correoElectronicoTxt;

    @FindBy(xpath = "//*[@id=\"a70f881b-ef95-ea11-a812-000d3ac166cd\"]")
    public WebElementFacade ciudadTxt;

    @FindBy(xpath = "//*[@id=\"ac9ddb60-616f-4f12-b4e2-9202f688ed2f\"]")
    public WebElementFacade empresaTxt;

    @FindBy(xpath = "//*[@id=\"08362b8f-b4ff-4d47-bc08-9b25a7e81e95\"]")
    public WebElementFacade celularTxt;

    @FindBy(xpath = "//*[@id=\"2048d706-a094-ea11-a812-000d3ac166cd\"]")
    public WebElementFacade mensajeTxt;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[5]/div/div[2]/div/div/div/input")
    public WebElementFacade politicasCheckbox;

    @FindBy(className = "lp-form-button lp-form-fieldInput")
    public WebElementFacade enviarBtn;

    @FindBy(xpath = "//*[@id=\"validation-summary\"]")
    public WebElementFacade mensajeErrorLabel;
}
