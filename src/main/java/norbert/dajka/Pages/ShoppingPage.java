package norbert.dajka.Pages;

import com.codeborne.selenide.SelenideElement;
import norbert.dajka.Body.Page;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingPage extends Page {

    private SelenideElement cartBadge = $("#shopping_cart_container");



    public boolean isShoppingCartBadgeVisible() {
        return cartBadge.isDisplayed() & cartBadge.exists();
    }
}
