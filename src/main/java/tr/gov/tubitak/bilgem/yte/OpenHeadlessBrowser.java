package tr.gov.tubitak.bilgem.yte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class OpenHeadlessBrowser {

    static WebDriver open(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/fatihsaracoglu/IdeaProjects/translator-service-with-selenium/src/main/java/tr/gov/tubitak/bilgem/yte/driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver wd = new ChromeDriver(options);
        wd.get(url);
        return wd;
    }
}
