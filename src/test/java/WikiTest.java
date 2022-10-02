import Old.WikiHomePage;
import Old.WikiSearchPage;
import org.testng.annotations.Test;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j

public class WikiTest {

    private final WikiHomePage wikiHomePage = new WikiHomePage();
    private final WikiSearchPage wikiSearchPage = new WikiSearchPage();


    @Test
    public void verifyWiki() {
        open("https://uk.wikipedia.org/");
        wikiHomePage.clickInSearchInput().enterText("Доберман");

        String actualNamePage = wikiSearchPage.getNamePageText().replaceAll("\\s*\\[[^]]*]\\s*", "");
        String expectedNamePage = "Доберман";

        assertThat(actualNamePage).as("The Page is not searched")
                .isEqualTo(expectedNamePage);
        log.info("wtf11111111");
    }

}
