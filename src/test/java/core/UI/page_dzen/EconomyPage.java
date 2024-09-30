package core.UI.page_dzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EconomyPage extends BaseView {
    public EconomyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".news-site--TopRubricHeading-desktop__title-ho")
    public WebElement titleCss;

    @FindBy(className = "news-site--TopRubricHeading-desktop__title-ho")
    public WebElement titleXpath;

}
