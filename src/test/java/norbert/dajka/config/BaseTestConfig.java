package norbert.dajka.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTestConfig {

    @BeforeTest
    public void setupConfig() {
        Configuration.browser = "Chrome";
        Configuration.headless = false;
    }
    @AfterClass
    public void closeBrowser() {
        Selenide.closeWindow();
    }
}
