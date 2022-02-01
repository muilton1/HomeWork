package home_work_6;


import home_work_6.api.ISearchEngine;

import java.io.File;
import java.util.List;
import java.util.Locale;

public class EasySearch implements ISearchEngine {
    private ISearchEngine engine;

    public long search(String text, String word) {
        String lowText = text.toLowerCase(Locale.ROOT);
        int count = 0;
        int index = lowText.indexOf(word);
        char[] wordToArray = word.toCharArray();
        int lastIndex = wordToArray.length;

        //Check pre and pos index of word to count it as a whole word
        while (index != -1) {
            if ((lowText.charAt(index - 1) == ' ') && (lowText.charAt(index + lastIndex) == ',')) {
                count++;
            }
            index = lowText.indexOf(word, index + 1);
        }
        System.out.print("Amount of repeated words(to lower case): ");
        return count;
    }

    @Override
    public List<String> delete(File file) {
        return this.engine.delete(file);
    }
}

