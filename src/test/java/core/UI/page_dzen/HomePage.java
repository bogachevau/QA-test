package core.UI.page_dzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseView {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".dzen-layout--desktop-base-header__logo-2H")
    private WebElement logoCss;

    @FindBy(className = "dzen-layout--desktop-base-header__logo-2H")
    private WebElement logoXpath;

    @FindBy(css = "a.dzen-desktop--currency-rates__rate-fu")
    private WebElement exchangeRateCss;

    @FindBy(className= "dzen-desktop--currency-rates__rate-fu")
    private WebElement exchangeRateXpath;

    @FindBy(css = ".dzen-desktop--floor-title__title-2v:not(:first-child)")
    private WebElement newsTitleCss;

    @FindBy(className = "dzen-desktop--floor-title__title-2v")
    private WebElement newsTitleXpath;

    @FindBy(css = ".dzen-layout--navigation-tab__tabContentInline-3v")
    private WebElement navigationTabCss;

    @FindBy(className = "dzen-layout--navigation-tab__tabContentInline-3v")
    private WebElement navigationTabXpath;

    public boolean checkLogoCss() {
        return logoCss.isDisplayed();
    }

    public boolean checkLogoXpath() {
        return logoXpath.isDisplayed();
    }

    public EconomyPage clickRateCss () {
        if (exchangeRateCss.isDisplayed()) {
            driver.get("https://dzen.ru/news/rubric/quotes");
        }
        return new EconomyPage(driver);
    }

    public EconomyPage clickRateXpath () {
        if (exchangeRateXpath.isDisplayed()) {
            driver.get("https://dzen.ru/news/rubric/quotes");
        }
        return new EconomyPage(driver);
    }

    public NewsPage clickNewsCss() {
        if (newsTitleCss.isDisplayed()) {
            driver.get("https://dzen.ru/news");
        }
        return new NewsPage(driver);
    }

    public NewsPage clickNewsXpath () {
        if (newsTitleXpath.isDisplayed()) {
            driver.get("https://dzen.ru/news");
        }
        return new NewsPage(driver);
    }

    public SubscriptionsManagerPage clickSubscriptionsCss() {
        if (navigationTabCss.isDisplayed()) {
            driver.get("https://dzen.ru/subscriptions-manager");
        }
        return new SubscriptionsManagerPage(driver);
    }

    public SubscriptionsManagerPage clickSubscriptionsXpath () {
        if (navigationTabXpath.isDisplayed()) {
            driver.get("https://dzen.ru/subscriptions-manager");
        }
        return new SubscriptionsManagerPage(driver);
    }

}
