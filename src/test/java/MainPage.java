import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    private static final SelenideElement searchInput= $x("//input[@type='text']");
public MainPage(String url){ // конструктор для открытия сайта, поэтому без названия, по сути инициализирует класс
    Selenide.open(url);
}
    public static void clickOnSearchInput(String searchString) {


         searchInput.setValue(searchString);
         searchInput.sendKeys(Keys.ENTER);
    }


}






