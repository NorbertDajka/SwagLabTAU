package norbert.dajka.Tests;

import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.Page;
import norbert.dajka.Product.Product;
import norbert.dajka.config.BaseTestConfig;
import norbert.dajka.dataprovider.ProductDataProvider;
import norbert.dajka.dataprovider.UserDataProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductCardLoadingTest extends BaseTestConfig {

    LoginModal loginModal = new LoginModal();
    Page page = new Page();

    @BeforeMethod
    public void setUp (){

        page.openSwaglabsUrl();
        loginModal.login("standard_user","secret_sauce");
    }
    @Test (dataProviderClass = ProductDataProvider.class, dataProvider = "allProductsDataProvider" )
        public void all_products_should_load_with_standard_user(Product product) {
        assertTrue(product.productExistsAndIsDisplayed());

    }

}
