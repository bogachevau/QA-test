package core.UI.page_dzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BaseView {

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".news-site--base-button__childrenContent-1L")
    private WebElement newsTitleCss;

    @FindBy(className = "news-site--base-button__childrenContent-1L")
    private WebElement newsTitleXpath;

    public boolean checkNewsTitleCss() {
        return newsTitleCss.isDisplayed();
    }

    public boolean checkNewsTitleXpath() {
        return newsTitleXpath.isDisplayed();
    }
}
