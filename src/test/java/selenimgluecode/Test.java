package selenimgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test extends TestBase{



    @Given("^Me encuentro en la pagina principal de Mercado Libre$")
    public void soy_un_usuario_registrado_en_ML() throws Throwable {
        Assert.assertEquals(homePageML.getTitulo(), driver.getTitle());


    }

    @When("^Acepto las cookies y presiono el boton Ingresa$")
    public void inserto_mis_datos_de_autenticacion() throws Throwable {
        WebElement botonCookies = driver.findElement(homePageML.getBotonCookies());
        botonCookies.click();
        WebElement botonIngresa = driver.findElement(homePageML.getBotonIngresa());
        botonIngresa.click();

    }

    @When("^Inserto el usuario y presiono el boton Ingresar$")
    public void hago_clic_en_Continuar() throws Throwable {
// Obtenemos el WebElement correspondiente al textfield "E-mail o Usuario"
        WebElement emailUser = driver.findElement(loginPageML.getEmailUser());
    //Ingresar valores en el textfield "E-mail o Usuario"
        emailUser.sendKeys("espyperez.2020@gmail.com");
        WebElement botonIngresar = driver.findElement(loginPageML.getBotonIngresar());
        botonIngresar.click();
   //No se puede ingresar el password, ya que ML esta protegido por reCAPTCHA


    }

    @Then("^Me lleva a la pagina para insertar la clave$")
    public void me_puedo_autenticar_correctamente() throws Throwable {
        Thread.sleep(4000);
        WebElement pageClave = driver.findElement(By.className("center-card__title"));
        Assert.assertTrue("No se redirigio a la pagina de insertar Clave", pageClave.isDisplayed());
        Assert.assertEquals(clavePageML.getTitlePageClave(), pageClave.getText());

    }

}
