package starter;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class FirstTestCase extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void myGoogleSearch() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
}
