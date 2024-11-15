package norbert.dajka.Body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginModal {

    private final SelenideElement userField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement errorMsg = $(".error-message-container");

    public void login(String username, String password) {
        userField.setValue(username);
        passwordField.setValue(password);
        loginButton.click();
    }

    public boolean errorMsgExistsAndVisible() {
        return this.errorMsg.exists() & errorMsg.isDisplayed();
    }

    public String getErrorMsg() {
        return errorMsg.text();
    }
}
