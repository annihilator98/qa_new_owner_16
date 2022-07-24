package qa.owner;

import qa.owner.config.WebTestProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebTestProvider().get();
    }

    @Test
    public void testRabota() {
        String title = driver.getTitle();
        WebElement searchbar = driver.findElement(By.id("a11y-search-input"));
        searchbar.sendKeys("QA");
        searchbar.submit();
        Assertions.assertEquals("Работа в Минске, свежие вакансии - rabota.by", title);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}
