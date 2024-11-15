package norbert.dajka.Body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    private final SelenideElement userField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");

    public void login(String username, String password) {
        userField.setValue(username);
        passwordField.setValue(password);
        loginButton.click();
    }
}
