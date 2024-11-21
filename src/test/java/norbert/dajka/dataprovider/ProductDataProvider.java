package norbert.dajka.dataprovider;

import norbert.dajka.Product.Product;
import org.testng.annotations.DataProvider;

public class ProductDataProvider {

    @DataProvider(name = "allProductsDataProvider")

    public Object[][] feedAllProducts() {

        Product sauceLabBackpack = new Product("4", "Sauce Labs Backpack", "29.99");
        Product saucelabJacket = new Product("5", "Sauce Labs Fleece Jacket", "49.99");
        Product sauceLabsBikeLight = new Product("0", "Sauce Labs Bike Light", "9.99");
        Product saucelabTshirt = new Product("1", "Sauce Labs Bolt T-Shirt", "15.99");
        Product saucelabOnesie = new Product("2", "Sauce Labs Onesie", "7.99");
        Product saucelabBugprod = new Product("3", "Test.allTheThings() T-Shirt (Red)", "15.99");
        return new Object[][]{
                {sauceLabBackpack},
                {saucelabJacket},
                {sauceLabsBikeLight},
                {saucelabTshirt},
                {saucelabOnesie},
                {saucelabBugprod}
        };
    }
}
