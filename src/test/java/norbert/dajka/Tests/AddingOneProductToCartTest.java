package norbert.dajka.Tests;

import norbert.dajka.Body.Header;
import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.Page;
import norbert.dajka.Pages.ProductDetailsPage;
import norbert.dajka.Pages.ShoppingPage;
import norbert.dajka.Product.Product;
import norbert.dajka.config.BaseTestConfig;
import norbert.dajka.dataprovider.ProductDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddingOneProductToCartTest extends BaseTestConfig {

    LoginModal login = new LoginModal();
    Page page = new Page();
    Product product;
    ShoppingPage shoppingPage = new ShoppingPage();
    Header header = new Header();
    ProductDetailsPage productPage = new ProductDetailsPage();


    @BeforeMethod
    public void setup() {
    page.openSwaglabsUrl();
    login.login("standard_user","secret_sauce");

    }

    @Test
    public void add_one_product_to_cart () {

        this.product = new Product("4","Sauce Labs Backpack","29.99","");
        product.addProductToCart();
        Assert.assertTrue(header.shoppingCartBageIsDisplayedAndExists());
        Assert.assertEquals(header.badgeTextNr(),1);
    }

    @Test
    public void select_product_details_page () {
        this.product = new Product("5","Sauce Labs Fleece Jacket","49.99","");
        product.selectProduct();

        Assert.assertTrue(productPage.isBackButtonDisplayedAndExists());
        Assert.assertEquals(productPage.getButtonText(),"Back to products");
    }
}


