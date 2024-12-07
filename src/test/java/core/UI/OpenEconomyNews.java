package core.UI;

import core.UI.page_dzen.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Ваша задача - автоматизировать открытие главной страницы сайта https://dzen.ru/,
 и переход с неё на страницу https://dzen.ru/news/quotes

 Requirements:
 1. Используется chrome driver
 2. Используется CSS локатор для первого теста в классе, xPath - для второго
 3. Присутствует проверка, что сайт успешно открылся - проверка осуществляется на отображение логотипа "Дзен" в шапке сайта
 4. Переход осуществляется по нажатию на иконку валюты доллара или евро
 5. После перехода - присутствует проверка, что мы находимся в блоке экономических новостей
 **/
public class OpenEconomyNews extends BaseTest {
    @Test
    public void testOpenEconomyNewsCss() {
        //String economyText = "Экономика";
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage
                .checkLogoCss());

        Assertions.assertTrue(homePage
                .clickRateCss()
                .checkEconomyCss());
    }

    @Test
    public void testOpenEconomyNewsXpath() {
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage
                .checkLogoXpath());

        Assertions.assertTrue(homePage
                .clickRateXpath()
                .checkEconomyXpath());
    }
}
