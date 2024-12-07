package core.UI;

import core.UI.page_dzen.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Ваша задача - автоматизировать открытие главной страницы сайта https://dzen.ru/,
 и переход с неё на страницу https://dzen.ru/news

 Requirements:
 1. Используется chrome driver
 2. Используется CSS локатор для первого теста в классе, xPath - для второго
 3. Присутствует проверка, что сайт успешно открылся - проверка осуществляется на отображение логотипа "Дзен" в шапке сайта
 4. Присутствует проверка, что есть кнопка панель с типами новостей - "Главные", "Политика", "Экономика" и пр.
 **/
public class OpenNewsScreen extends BaseTest {
    @Test
    public void openNewsCss() {
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage
                .checkLogoCss());

        Assertions.assertTrue(homePage
                .clickNewsCss()
                .checkNewsTitleCss());
    }

    @Test
    public void openNewsXpath() {
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage
                .checkLogoXpath());

        Assertions.assertTrue(homePage
                .clickNewsXpath()
                .checkNewsTitleXpath());
    }
}
