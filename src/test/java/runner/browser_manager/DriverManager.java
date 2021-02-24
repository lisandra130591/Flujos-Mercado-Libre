package runner.browser_manager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void createDriver();

    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver= null;
        }
    }

    /*public void setDriver(WebDriver driver) {
        this.driver = driver;
    }*/

    public WebDriver getDriver() {
        if(driver == null){
            createDriver();
        }
        return driver;
    }
}
