package norbert.dajka;
import static com.codeborne.selenide.Selenide.*;



public class SwagLabsPage {
    String swagLabsUrl = ("https://www.saucedemo.com/");

    public void openSwaglabsUrl () {
        open(swagLabsUrl);
    }

}
