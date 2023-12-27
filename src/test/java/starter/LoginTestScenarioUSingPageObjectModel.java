package starter;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTestScenarioUSingPageObjectModel  {

    @Managed
    WebDriver driver;

    @Steps
    Homepage home;

    @Test
    public void loginAsAdmin() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        home.verifyTitle();
        home.enterCredential();
        home.verifyDashboard();

    }
}
