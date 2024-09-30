package core.UI.page_dzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseView {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public BaseView(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }
}
