package tr.gov.tubitak.bilgem.yte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SearchService {

    static String search(String sourceLang, String targetLang, String keyword) {
        String url = "https://translate.google.com/#view=home&op=translate&sl=" + sourceLang + "&tl=" + targetLang + "&text=" + keyword;
        WebDriver wd = OpenHeadlessBrowser.open(url);
        WebElement webElement = wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div/span[1]/span"));
        return webElement.getText();
    }
}
