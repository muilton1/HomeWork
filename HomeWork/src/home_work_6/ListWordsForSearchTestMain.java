package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.decorators.RegExSearch;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;

import java.io.File;
import java.util.List;

public class ListWordsForSearchTestMain {
    public static void main(String[] args) {
        ISearchEngine ise = new RegExSearch(new SearchEnginePunctuationNormalizer(new EasySearch()));
        List<String> words = ise.delete(new File("HomeWork/src/home_work_6/books/Война и мир.txt"));

        System.out.println(ise.search(String.valueOf(words), "война"));
        System.out.println(ise.search(String.valueOf(words), "и"));
        System.out.println(ise.search(String.valueOf(words), "мир"));

        ISearchEngine ise2 = new EasySearch();
        System.out.println(ise2.search(String.valueOf(words), "война"));
        System.out.println(ise2.search(String.valueOf(words), "и"));
        System.out.println(ise2.search(String.valueOf(words), "мир"));
    }
}
