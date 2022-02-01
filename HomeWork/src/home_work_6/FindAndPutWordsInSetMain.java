package home_work_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FindAndPutWordsInSetMain {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        try {
            try (FileReader fileReader = new FileReader("HomeWork/src/home_work_6/books/Война и мир.txt")) {

                int symbol;

                while ((symbol = fileReader.read()) != -1) {
                    if (symbol != ' ' && symbol != ',' && symbol != '\n'
                            && symbol != '.' && symbol != '!' && symbol != '?'
                            && symbol != ':' && symbol != '"' && symbol != ';'
                            && symbol != ')' && symbol != '(' && symbol != '*'
                            && symbol != '<' && symbol != '^' && symbol != '=') {
                        builder.append((char) symbol);
                    } else {
                        words.add(builder.toString());
                        builder.setLength(0);
                    }
                }
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Error, file not found");
        } catch (
                IOException e) {
            System.out.println("File read error");
        }

        words.add(builder.toString());

        words.remove("");
        words.remove("--");
        words.remove("-");

        System.out.println("Number of unique words: " + words.size());
    }
}
