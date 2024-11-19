package norbert.dajka.Body;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;



public class Page {
    String swagLabsUrl = ("https://www.saucedemo.com/");

    public void openSwaglabsUrl () {
        open(swagLabsUrl);
    }

    public void refresh() {
        Selenide.refresh();}

}
