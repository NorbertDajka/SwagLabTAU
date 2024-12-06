package norbert.dajka.Tests;
import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.Page;
import norbert.dajka.Product.Product;
import norbert.dajka.config.BaseTestConfig;
import norbert.dajka.dataprovider.ProductDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyingProductVisibilityTest extends BaseTestConfig {

    Page page = new Page();
    LoginModal login = new LoginModal();

    @BeforeMethod

    public void setup() {
        page.openSwaglabsUrl();
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_products_load_as_standard_user(Product product){
        login.login("standard_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_products_load_as_problem_user(Product product){
        login.login("problem_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_products_load_as_performance_glitch_user(Product product){
        login.login("performance_glitch_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_products_load_as_error_user(Product product){
        login.login("error_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_products_load_as_visual_user(Product product){
        login.login("visual_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
    }
}
