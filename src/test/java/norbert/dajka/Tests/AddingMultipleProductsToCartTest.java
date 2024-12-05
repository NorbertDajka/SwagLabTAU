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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingMultipleProductsToCartTest extends BaseTestConfig {

    LoginModal login = new LoginModal();
    Page page = new Page();
    Product product;
    ShoppingPage shoppingPage = new ShoppingPage();
    Header header = new Header();
    int expectedProductNr = 1;
    ProductDetailsPage productPage = new ProductDetailsPage();

    @BeforeClass
    public void setup() {
        page.openSwaglabsUrl();
        login.login("standard_user","secret_sauce");

    }


    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void add_all_products_to_cart_as_standard_user(Product product) {
        this.product = new Product(product.getProductId(),product.getProductName(),product.getProductPrice());
        product.addProductToCart();

        Assert.assertTrue(header.shoppingCartBageIsDisplayedAndExists());
        Assert.assertEquals(header.badgeTextNr(),expectedProductNr++);

    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void select_all_products_to_cart_as_standard_user(Product product) {
        this.product = new Product(product.getProductId(),product.getProductName(),product.getProductPrice());
        product.selectProduct();

        Assert.assertTrue(productPage.isBackButtonDisplayedAndExists());
        Assert.assertEquals(productPage.getButtonText(),"Back to products");

        productPage.clickBack();


    }
}
