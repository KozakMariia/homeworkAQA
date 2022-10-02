package Old;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class WikiHomePage {

    private final SelenideElement searchInput = $("input[type*='search']");

    @Step
    public WikiHomePage clickInSearchInput() {
        searchInput.click();
        return this;
    }

    @Step
    public void enterText(String text) {
        searchInput.val(text).pressEnter();
    }

}
