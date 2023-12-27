package starter;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTestScenario extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void myLoginOrange() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElementFacade username=$(By.name("username"));
        username.typeAndTab("Admin");
        Thread.sleep(12000);
        WebElementFacade password=$(By.name("password"));
        password.typeAndEnter("admin123");
        Thread.sleep(20000);


    }
}
