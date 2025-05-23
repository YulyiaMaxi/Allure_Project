import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AppleTest extends BaseTest {
    String url = "https://appleinsider.ru/";
    String searchInput = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkFilm() {
        Selenide.open("https://www.kinopoisk.ru/s/");
        $x("//*[@id = 'find']").sendKeys("Сумерки");



        /* MainPage mainPage = new MainPage(url);// поскольку обращаемся к конструктору класса main , то на вход передаем url
            MainPage.clickOnSearchInput(searchInput);
            SearchPage searchPage = new SearchPage();
            String line = searchPage.findHref();
            //boolean contain = ;//когда нам надо проверить результат, мы не можем записать в переменную String, int, поэтому записываем в boolean
            Assertions.assertEquals(true, line.contains("iphone-13"));
        }*/
    }
}
