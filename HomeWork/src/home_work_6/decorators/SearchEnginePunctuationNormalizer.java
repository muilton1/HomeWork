package home_work_6.decorators;

import home_work_6.api.ISearchEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine engine;

    public SearchEnginePunctuationNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    public ISearchEngine getEngine() {
        return this.engine;
    }

    @Override
    public long search(String text, String word) {
        return this.engine.search(text, word);
    }

    @Override
    public List<String> delete(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error, file not found");
        }
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("[$&+,:;=?@#|'<>.^*()%!\"]", "");
            line = line.replace("--", "");
            for (String words : line.split(" ")) {
                if (words != null) {
                    words = words.trim();
                    if (words.length() > 0) {
                        list.add(words);
                    }
                }
            }
        }
        scanner.close();
        return list;
    }
}
