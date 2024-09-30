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

    public boolean checkLogoCss() {
        return logoCss.isDisplayed();
    }

    public boolean checkLogoXpath() {
        return logoXpath.isDisplayed();
    }

    public EconomyPage clickRateCss () {
        exchangeRateCss.click();
        return new EconomyPage(driver);
    }

    public EconomyPage clickRateXpath () {
        exchangeRateXpath.click();
        return new EconomyPage(driver);
    }




}
