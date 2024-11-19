package norbert.dajka.Body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Header extends Page {

    SelenideElement title = $(".login_logo");
}
