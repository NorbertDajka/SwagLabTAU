package norbert.dajka.Product;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Product {

    private final SelenideElement productCard;
    private final SelenideElement productLink;
    private final SelenideElement productAddToCartButton;
    private String name;
    private String price;



    public Product(String productId , String productName, String productPrice) {
        String productSelector = String.format("#item_%s_title_link", productId);
        this.productCard = $(productSelector).parent().parent();
        this.productLink = $(productSelector);
        this.productAddToCartButton = productCard.$("button[name^='add'");
    }

    public void addProductToCart() {
           this.productLink.click();
    }

    public void selectProduct(){
        
    }
}
