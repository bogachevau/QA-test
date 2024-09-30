package core.UI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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
        driver.findElement(By.cssSelector("a.dzen-desktop--currency-rates__rate-fu")).click();
        String url = driver.getCurrentUrl();
        boolean textEconomyNews = driver.findElement(By
                .xpath("//h1[@class='news-site--TopRubricHeading-desktop__title-ho']")).isDisplayed();
        Assertions.assertTrue(textEconomyNews);
    }
}
