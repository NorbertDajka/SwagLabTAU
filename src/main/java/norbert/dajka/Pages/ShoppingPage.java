package norbert.dajka.Pages;

import com.codeborne.selenide.SelenideElement;
import norbert.dajka.Body.SwagLabsPage;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingPage extends SwagLabsPage {

    private SelenideElement cartBadge = $("#shopping_cart_container");

    public boolean isShoppingCartBadgeVisible() {
        return cartBadge.isDisplayed() & cartBadge.exists();
    }
}
