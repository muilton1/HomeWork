package home_work_6.api;

import java.io.File;
import java.util.List;

public interface ISearchEngine {
    long search(String text, String word);

    List<String> delete(File file);
}
