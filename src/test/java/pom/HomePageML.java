package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageML extends BasePage{

    private String titulo = "Mercado Libre Uruguay";
    private By botonCookies = By.className("nav-cookie-disclaimer__button");
    private By botonIngresa = By.xpath("//*[@id=\"nav-header-menu\"]/a[2]");

    public String getTitulo() {
        return titulo;
    }

    public By getBotonCookies() {
        return botonCookies;
    }

    public By getBotonIngresa() {
        return botonIngresa;
    }

    public HomePageML(WebDriver driver){
        super(driver);
    }
}
