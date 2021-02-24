package selenimgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    public static int nroCaso = 0;
    private DriverManager driverManager;


    @Before
    public void setUp(){
        nroCaso ++;
        System.out.println("Se esta ejecutando el escenario nro. " + nroCaso);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.mercadolibre.com.uy/");
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
        System.out.println("El escenario " + nroCaso + " se ejecuto correctamente");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
