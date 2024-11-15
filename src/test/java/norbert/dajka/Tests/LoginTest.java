package norbert.dajka.Tests;

import norbert.dajka.Body.Login;
import norbert.dajka.Body.SwagLabsPage;
import norbert.dajka.Pages.ShoppingPage;
import norbert.dajka.config.BaseTestConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestConfig {

    SwagLabsPage page;
    Login login;

@BeforeMethod

    public void setUp()  {
        page = new SwagLabsPage();
        login = new Login();
        this.page.openSwaglabsUrl();

}

@Test
    public void testLoginWithValidCredentials()  {

    this.login.login("standard_user","secret_sauce");

    ShoppingPage sPage = new ShoppingPage();
    Assert.assertTrue(sPage.isShoppingCartBadgeVisible(),"Login is functional");
    }

}
