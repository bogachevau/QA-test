package core.UI;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/** Ваша задача - автоматизировать открытие главной страницы сайта https://dzen.ru/,
 и переход с неё на страницу https://dzen.ru/news

 Requirements:
 1. Используется chrome driver
 2. Используется CSS локатор для первого теста в классе, xPath - для второго
 3. Присутствует проверка, что сайт успешно открылся - проверка осуществляется на отображение логотипа "Дзен" в шапке сайта
 4. Присутствует проверка, что есть кнопка панель с типами новостей - "Главные", "Политика", "Экономика" и пр.
 **/
public class OpenNewsScreen {
}
