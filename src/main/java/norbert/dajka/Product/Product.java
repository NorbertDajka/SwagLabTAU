package norbert.dajka.Product;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Product {

    private final SelenideElement productCard;
    private final SelenideElement productLink;
    private final SelenideElement productAddToCartButton;
    private String productName;
    private String productPrice;
    private String productId;



    public Product(String productId , String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productId = productId;
        String productSelector = String.format("#item_%s_title_link", productId);
        this.productCard = $(productSelector).parent().parent();
        this.productLink = $(productSelector);
        this.productAddToCartButton = productCard.$("button[name^='add'");
    }

    public void addProductToCart() {
           this.productAddToCartButton.click();
    }

    public void selectProduct(){
        this.productLink.click();

    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProductId() {
        return productId;
    }
    public boolean productExistsAndIsDisplayed()
    {return this.productCard.exists()&productCard.isDisplayed();}
}
