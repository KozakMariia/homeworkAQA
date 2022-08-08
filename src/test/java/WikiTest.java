import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class WikiTest {

    private final WikiHomePage wikiHomePage = new WikiHomePage();
    private final WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Test
    public void verifyWiki() {
        open("https://uk.wikipedia.org/");
        wikiHomePage.clickInSearchInput().enterText("Доберман");

        String actualNamePage = wikiSearchPage.getNamePageText();
        String expectedNamePage = "Доберман[ред. | ред. код]";

        assertThat(actualNamePage).as("The Page is not searched")
                .isEqualTo(expectedNamePage);
    }

}
