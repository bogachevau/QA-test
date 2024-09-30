package core.UI;

import core.UI.page_dzen.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * Ваша задача - автоматизировать открытие главной страницы сайта https://dzen.ru/
 * <p>
 * Requirements:
 * 1. Используется chrome driver
 * 2. Используется CSS локатор для первого теста в классе, xPath - для второго
 * 3. Присутствует проверка, что сайт успешно открылся - проверка осуществляется на отображение логотипа "Дзен" в шапке сайта
 **/
public class OpenBaseScreen extends BaseTest {
    @Test
    public void testOpenBaseScreenCss() {
        HomePage homePage = new HomePage(driver);
        homePage.checkLogoCss();
    }

    @Test
    public void testOpenBaseScreenHtml() {

    }

}
