package norbert.dajka.Pages;

import com.codeborne.selenide.SelenideElement;
import norbert.dajka.Body.Page;

import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage extends Page {

    private final SelenideElement backButton =$ ("#back-to-products");

    public boolean isBackButtonDisplayedAndExists() {
        return this.backButton.isDisplayed()&this.backButton.exists();
    }

    public String getButtonText(){
        return this.backButton.text();
    }

    public void clickBack() {
        this.backButton.click();
    }
}
