package norbert.dajka.Tests;

import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.SwagLabsPage;
import norbert.dajka.Pages.ShoppingPage;
import norbert.dajka.config.BaseTestConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginModalTest extends BaseTestConfig {

    SwagLabsPage page;
    LoginModal loginModal;

@BeforeMethod

    public void setUp()  {
        page = new SwagLabsPage();
        loginModal = new LoginModal();
        this.page.openSwaglabsUrl();

}

@Test
    public void testLoginWithValidCredentials()  {

    loginModal.login("standard_user","secret_sauce");

    ShoppingPage sPage = new ShoppingPage();
    Assert.assertTrue(sPage.isShoppingCartBadgeVisible(),"Login is functional");
    }
@Test
    public void testLoginWithNoCredentials(){

    loginModal.login("","");
    Assert.assertTrue(loginModal.errorMsgExistsAndVisible());
    Assert.assertEquals(loginModal.getErrorMsg(),"Epic sadface: Username is required");

    }

}
