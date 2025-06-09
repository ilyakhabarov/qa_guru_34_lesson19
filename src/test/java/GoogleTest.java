import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest {

    @Test
    void checkTitle() {
        open("https://google.com");
        String title = title();
        assertThat(title).isEqualTo("Google");
    }
}