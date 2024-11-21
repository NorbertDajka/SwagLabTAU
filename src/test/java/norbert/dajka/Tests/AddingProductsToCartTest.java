package norbert.dajka.Tests;

import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.Page;
import norbert.dajka.Pages.ShoppingPage;
import norbert.dajka.Product.Product;
import norbert.dajka.config.BaseTestConfig;
import norbert.dajka.dataprovider.ProductDataProvider;
import org.testng.annotations.*;

public class AddingProductsToCartTest extends BaseTestConfig {

    LoginModal login = new LoginModal();
    Page page = new Page();
    Product product;
    ShoppingPage shoppingPage = new ShoppingPage();

    @BeforeMethod
    public void setup() {
    page.openSwaglabsUrl();
    login.login("standard_user","secret_sauce");

    }

    @Test
    public void add_one_product_to_cart () {

        this.product = new Product("4","Sauce Labs Backpack","29.99");
        product.addProductToCart();
    }

    @Test
    public void select_product_details_page () {
        this.product = new Product("5","Sauce Labs Fleece Jacket","49.99");
        product.selectProduct();
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void add_all_products_to_cart_as_standard_user(Product product) {
        this.product = new Product(product.getProductId(),product.getProductName(),product.getProductPrice());
        product.addProductToCart();

    }

}
