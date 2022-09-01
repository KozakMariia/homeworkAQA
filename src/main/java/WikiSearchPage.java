import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WikiSearchPage {
    private final SelenideElement namePageText = $("div[id='content'] h1");

    @Step
    public String getNamePageText() {
        return namePageText.shouldBe(visible)
                .getText();
    }
}
