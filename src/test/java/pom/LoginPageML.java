package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageML extends BasePage{

    private By emailUser = By.id("user_id");
    private By botonIngresar = By.className("andes-button__content");

    public By getEmailUser() {
        return emailUser;
    }

    public By getBotonIngresar() {
        return botonIngresar;
    }

    public LoginPageML(WebDriver driver){
        super(driver);
    }
}
