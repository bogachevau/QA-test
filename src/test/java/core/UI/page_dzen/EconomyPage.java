package core.UI.page_dzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EconomyPage extends BaseView {
    public EconomyPage(WebDriver driver) {
        super(driver);
    }

    //https://dzen.ru/news/rubric/quotes

    @FindBy(css = ".news-site--TopRubricHeading-desktop__title-ho")
    private WebElement titleCss;

    @FindBy(className = "news-site--TopRubricHeading-desktop__title-ho")
    private WebElement titleXpath;

    public boolean checkEconomyCss() {
        return titleCss.isDisplayed();
    }

    public boolean checkEconomyXpath() {
        return titleXpath.isDisplayed();
    }

}
