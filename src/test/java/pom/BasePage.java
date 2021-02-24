package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception{
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo localizar el elemento: "+element);
        }

    }

    public void sendKeys(By campoTexto, String text) throws Exception{
        try {
            driver.findElement(campoTexto).sendKeys(text);
        }catch (Exception e){
            throw new Exception("No se pudo encontrar enviar contenido al campo: "+campoTexto);
        }

    }

    public String getText(By element) throws Exception{
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto el elemento: "+element);
        }

    }

    public String getTitle() throws Exception{
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo de la pagina");
        }

    }
}
