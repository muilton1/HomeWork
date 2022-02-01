package home_work_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FindAndPutWordsInMapMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        Map<String, Integer> words = new HashMap<>();

        int symbol;

        try {
            try (FileReader fileReader = new FileReader("HomeWork/src/home_work_6/books/Война и мир.txt")) {

                while ((symbol = fileReader.read()) != -1) {
                    Integer duplicate = words.get(builder.toString());
                    if (symbol != ' ' && symbol != ',' && symbol != '\n'
                            && symbol != '.' && symbol != '!' && symbol != '?'
                            && symbol != ':' && symbol != '"' && symbol != ';'
                            && symbol != ')' && symbol != '(' && symbol != '*'
                            && symbol != '<' && symbol != '^' && symbol != '=') {
                        builder.append((char) symbol);
                    } else {
                        words.put(builder.toString(), duplicate == null ? 1 : duplicate + 1);
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
        words.remove("");
        words.remove("--");
        words.remove("-");

        System.out.println("Words count: " + words.size());

        List<Map.Entry<String, Integer>> list = new LinkedList<>(words.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        System.out.println("How many values do you want to get?");

        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.println(list.get(i));
        }
    }
}
