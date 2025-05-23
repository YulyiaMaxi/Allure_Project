import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.screenshots;
import static com.codeborne.selenide.Selenide.closeWebDriver;


public class BaseTest {
//@BeforeEach

    public void init() {
        // Добавляем слушатель для Allure
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        // Настраиваем WebDriver
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        //screenshots = "build/allure-results";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после каждого теста
        closeWebDriver();
    }


}
