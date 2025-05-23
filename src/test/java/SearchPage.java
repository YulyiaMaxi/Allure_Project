import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    //public SearchPage(String url2){ // конструктор для открытия сайта, поэтому без названия, по сути инициализирует класс
       // Selenide.open(url2);
   // }

   /* public SearchPage(){
        SelenideElement url2 = $x("//a[@href='https://appleinsider.ru/eto-interesno/chem-otlichaetsya-iphone-13-pro-ot-iphone-12-pro.html' and @rel='bookmark']");
        url2.click();
    }*/

    private final ElementsCollection FirstArticle = $$x("//h2//a");
    public  String findHref() {

        return FirstArticle.first().getAttribute("href");
    }

}
