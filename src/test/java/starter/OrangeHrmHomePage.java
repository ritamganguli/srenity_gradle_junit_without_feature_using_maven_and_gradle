package starter;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.jupiter.api.Assertions;
import nonapi.io.github.classgraph.utils.Assert;
import org.openqa.selenium.By;

public class OrangeHrmHomePage extends PageObject {



    public void verifyTitle(){
        String title= getDriver().getTitle();
        Assertions.assertTrue(title.contains("OrangeHRM"));

    }

    public void enterCredential() throws InterruptedException {
        WebElementFacade username=$(By.name("username"));
        username.typeAndTab("Admin");
        Thread.sleep(12000);
        WebElementFacade password=$(By.name("password"));
        password.typeAndEnter("admin123");
        Thread.sleep(20000);

    }

    public void verifyDashboard(){
        String currentUrl=getDriver().getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains("dashboard"));

    }

}