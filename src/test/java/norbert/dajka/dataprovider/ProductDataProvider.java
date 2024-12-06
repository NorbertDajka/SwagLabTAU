package norbert.dajka.dataprovider;

import norbert.dajka.Product.Product;
import org.testng.annotations.DataProvider;

public class ProductDataProvider {

    @DataProvider(name = "allProductsDataProvider")

    public Object[][] feedAllProducts() {

        Product sauceLabBackpack = new Product("4", "Sauce Labs Backpack", "29.99", "https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg");
        Product saucelabJacket = new Product("5", "Sauce Labs Fleece Jacket", "49.99","https://www.saucedemo.com/static/media/sauce-pullover-1200x1500.51d7ffaf.jpg");
        Product sauceLabsBikeLight = new Product("0", "Sauce Labs Bike Light", "9.99","https://www.saucedemo.com/static/media/bike-light-1200x1500.37c843b0.jpg");
        Product saucelabTshirt = new Product("1", "Sauce Labs Bolt T-Shirt", "15.99","https://www.saucedemo.com/static/media/bolt-shirt-1200x1500.c2599ac5.jpg");
        Product saucelabOnesie = new Product("2", "Sauce Labs Onesie", "7.99","https://www.saucedemo.com/static/media/red-onesie-1200x1500.2ec615b2.jpg");
        Product saucelabBugprod = new Product("3", "Test.allTheThings() T-Shirt (Red)", "15.99","https://www.saucedemo.com/static/media/red-tatt-1200x1500.30dadef4.jpg");
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
