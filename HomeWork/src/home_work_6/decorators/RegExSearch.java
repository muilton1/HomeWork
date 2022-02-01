package home_work_6.decorators;

import home_work_6.api.ISearchEngine;

import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private ISearchEngine engine;

    public RegExSearch(ISearchEngine engine) {
        this.engine = engine;
    }

    public ISearchEngine getEngine() {
        return engine;
    }

    @Override
    public long search(String text, String word) {
        long count = 0;
        //Word bound check
        String words = "\\b" + word + "\\b";
        //Makes Matcher case insensitive while find words
        Pattern pattern = Pattern.compile(words, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        System.out.print("Amount of repeated words(case insensitive): ");
        return count;
    }

    @Override
    public List<String> delete(File file) {
        return this.engine.delete(file);
    }
}

