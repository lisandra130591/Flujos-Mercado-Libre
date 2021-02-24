package selenimgluecode;

import org.openqa.selenium.WebDriver;
import pom.ClavePageML;
import pom.HomePageML;
import pom.LoginPageML;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePageML homePageML = new HomePageML(driver);
    protected LoginPageML loginPageML = new LoginPageML(driver);
    protected ClavePageML clavePageML = new ClavePageML(driver);
}
