package core.UI.page_dzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionsManagerPage extends BaseView {

    public SubscriptionsManagerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".desktop2--base-button__v2-3Q")
    private WebElement btnEntryCss;

    @FindBy(className = "desktop2--base-button__v2-3Q")
    private WebElement btnEntryXpath;

    @FindBy(css = ".desktop2--login-by-phone-vk-id__vkIdInfo-LO")
    private WebElement btnEntryVkCss;

    @FindBy(className = "desktop2--login-by-phone-vk-id__vkIdInfo-LO")
    private WebElement btnEntryVkXpath;

    @FindBy(css = ".desktop2--base-login-button__loginButtonText-cT")
    private WebElement btnEntryYandexCss;

    @FindBy(className = "desktop2--base-login-button__loginButtonText-cT")
    private WebElement btnEntryYandexXpath;

    public boolean checkAddSubscriptionCss() {
        return btnEntryCss.isDisplayed();
    }

    public boolean checkAddSubscriptionXpath() {
        return btnEntryXpath.isDisplayed();
    }

    public SubscriptionsManagerPage clickEntryCss() {
        btnEntryCss.click();
        return new SubscriptionsManagerPage(driver);
    }

    public SubscriptionsManagerPage clickEntryXpath() {
        btnEntryXpath.click();
        return new SubscriptionsManagerPage(driver);
    }

    public boolean checkEntryVkAndYandexCss() {
        return btnEntryVkCss.isDisplayed() && btnEntryYandexCss.isDisplayed();
    }

    public boolean checkEntryVkAndYandexXpath() {
        return btnEntryVkXpath.isDisplayed() && btnEntryYandexXpath.isDisplayed();
    }
}
