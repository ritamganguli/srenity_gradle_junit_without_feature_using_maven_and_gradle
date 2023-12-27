package starter;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    OrangeHrmHomePage home;

    @Step("This will verify the title")
    public void verifyTitle(){
        home.verifyTitle();

    }

    @Step("Entering Credentials Over Here")
    public void enterCredential() throws InterruptedException {
        home.enterCredential();

    }

    @Step("Verifying the dashboard")
    public void verifyDashboard(){
        home.verifyDashboard();

    }
}
