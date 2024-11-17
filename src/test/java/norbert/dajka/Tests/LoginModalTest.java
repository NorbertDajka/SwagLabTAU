package norbert.dajka.Tests;

import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.SwagLabsPage;
import norbert.dajka.Pages.ShoppingPage;
import norbert.dajka.config.BaseTestConfig;
import norbert.dajka.dataprovider.User;
import norbert.dajka.dataprovider.UserDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginModalTest extends BaseTestConfig {

    SwagLabsPage page;
    LoginModal loginModal;
    ShoppingPage sPage;
@BeforeMethod

    public void setUp()  {
        page = new SwagLabsPage();
        loginModal = new LoginModal();
        this.page.openSwaglabsUrl();
        sPage = new ShoppingPage();

}

@Test (dataProviderClass = UserDataProvider.class, dataProvider = "validUserDataProvider")

    public void users_can_login_with_valid_userdata(User user)  {
    loginModal.login(user.getUsername(), user.getPassword());
    Assert.assertTrue(sPage.isShoppingCartBadgeVisible(),"Login is functional");
    }
@Test
    public void users_cannot_login_with_no_credentials(){

    loginModal.login("","");
    Assert.assertTrue(loginModal.errorMsgExistsAndVisible());
    Assert.assertEquals(loginModal.getErrorMsg(),"Epic sadface: Username is required");

    }
@Test (dataProviderClass = UserDataProvider.class, dataProvider = "invalidUserDataProvider")

    public void users_cannot_login_with_invalid_credentials(User user) {

    loginModal.login(user.getUsername(),user.getPassword());
    Assert.assertTrue(loginModal.errorMsgExistsAndVisible());
    Assert.assertEquals(loginModal.getErrorMsg(),"Epic sadface: Username and password do not match any user in this service");

}

    @Test (dataProviderClass = UserDataProvider.class, dataProvider = "lockedUserDataProvider")

    public void users_cannot_login_with_locked_credentials(User user) {

        loginModal.login(user.getUsername(),user.getPassword());
        Assert.assertTrue(loginModal.errorMsgExistsAndVisible());
        Assert.assertEquals(loginModal.getErrorMsg(),"Epic sadface: Sorry, this user has been locked out.");

    }

}
