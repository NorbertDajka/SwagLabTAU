package norbert.dajka.Tests;

import norbert.dajka.Body.LoginModal;
import norbert.dajka.Body.Page;
import norbert.dajka.Product.Product;
import norbert.dajka.dataprovider.ProductDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class VerifyProductPictureTest {
    Page page = new Page();
    LoginModal login = new LoginModal();

    @BeforeMethod

    public void setup() {
        page.openSwaglabsUrl();
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_product_pictures_load_correctly_as_standard_user(Product product){
        login.login("standard_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
        Assert.assertEquals(product.getProductPictureLinkText(),product.getProductPictureLink());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_product_pictures_load_correctly_as_problem_user(Product product){
        login.login("problem_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
        Assert.assertEquals(product.getProductPictureLinkText(),product.getProductPictureLink());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_product_pictures_load_correctly_as_performance_glitch_user(Product product){
        login.login("performance_glitch_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
        Assert.assertEquals(product.getProductPictureLinkText(),product.getProductPictureLink());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_product_pictures_load_correctly_as_error_user(Product product){
        login.login("error_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
        Assert.assertEquals(product.getProductPictureLinkText(),product.getProductPictureLink());
    }

    @Test(dataProviderClass = ProductDataProvider.class,dataProvider = "allProductsDataProvider")

    public void verify_if_all_product_pictures_load_correctly_as_visual_user(Product product){
        login.login("visual_user","secret_sauce");
        Assert.assertTrue(product.productExistsAndIsDisplayed());
        Assert.assertEquals(product.getProductPictureLinkText(),product.getProductPictureLink());
    }

}
