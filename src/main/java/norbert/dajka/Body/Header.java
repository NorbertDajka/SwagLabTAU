package norbert.dajka.Body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Header extends Page {

    private SelenideElement title = $(".login_logo");
    private SelenideElement shoppingCartBadge = $(".shopping_cart_badge");


    public boolean shoppingCartBageIsDisplayedAndExists(){
        return this.shoppingCartBadge.isDisplayed()&this.shoppingCartBadge.exists();
    }

    public int badgeTextNr(){
        return Integer.parseInt(this.shoppingCartBadge.text());
    }

}
