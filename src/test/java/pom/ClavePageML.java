package pom;

import org.openqa.selenium.WebDriver;

public class ClavePageML extends BasePage{

    String titlePageClave = "Ahora, tu clave";

    public String getTitlePageClave() {
        return titlePageClave;
    }

    public ClavePageML(WebDriver driver){
        super(driver);
    }
}
