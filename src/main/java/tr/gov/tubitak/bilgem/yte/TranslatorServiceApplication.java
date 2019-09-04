package tr.gov.tubitak.bilgem.yte;

import java.util.Scanner;

public class TranslatorServiceApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keyword = "", translatedKeyword, sourceLang, targetLang;
        System.out.print("Enter the language which you want to translate from: ");
        sourceLang = scan.next();
        System.out.print("Enter the language which you want to translate to: ");
        targetLang = scan.next();
        while (true) {
            System.out.print("Enter a keyword: ");
            keyword = scan.next();
            if (keyword.equals("q")) break;
            translatedKeyword = SearchService.search(sourceLang, targetLang, keyword);
            System.out.println("Translated keyword: " + translatedKeyword);
        }
    }
}
