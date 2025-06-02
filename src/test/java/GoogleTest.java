import config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTest {

    private final WebDriver driver = new WebDriverProvider().get();

    @Test
    void checkTitle() {
        driver.get("https://google.com");
        assertEquals("Google", driver.getTitle());
    }
}