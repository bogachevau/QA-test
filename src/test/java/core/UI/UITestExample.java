package core.UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/** Ниже находится базовый пример теста на Selenium **/
public class UITestExample {

    @Test
    public void FirstUITest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.close();
        driver.quit();
    }
}
