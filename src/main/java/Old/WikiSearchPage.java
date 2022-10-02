package Old;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class WikiSearchPage {

    private final SelenideElement namePageText = $("div[id='content'] h1");

    @Step
    public String getNamePageText() {
        log.info("wtf");
        return namePageText.shouldBe(visible)
                .getText();
    }
}
