package gitHaveText;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Enterprize {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void testHaveText() {

        open("/");

        $(".Header-old ").$$("li").findBy(text("Solutions")).hover().$(".HeaderMenu-dropdown").$$("li").find(text("Enterprise")).click();
        $("#hero-section-brand-heading").shouldBe(text("The AI-powered\n" + "developer platform."));

}
}
