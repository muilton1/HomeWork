package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.decorators.RegExSearch;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class BooksWordsSearchingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Print all filenames in a given directory
        File directory = new File("HomeWork/src/home_work_6/books");
        if (directory.isDirectory()) {
            for (File item : Objects.requireNonNull(directory.listFiles())) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " \t folder");
                } else {
                    System.out.println(item.getName() + " \t file");
                }
            }
        }
        //Creating a file,if created already,print "File has been created already"
        File result = new File("HomeWork/src/home_work_6/result.txt");
        try {
            boolean created = result.createNewFile();
            if (created)
                System.out.println("File has been created already");
        } catch (IOException ex) {
            System.out.println("File read error");
        }
        //To make my code more universal I decided to use this,because getPath has
        //a bit differ output format(D:\......\.....\.....\),but need (D:/...../...../...../)
        String path = directory.getPath();
        path = path.replaceAll("\\\\", "/") + "/";
        System.out.println("Choose text for words searching :");
        String choose = path + scanner.nextLine();

        ISearchEngine ise = new SearchEnginePunctuationNormalizer(new RegExSearch(new EasySearch()));
        String str = String.valueOf(ise.delete(new File(choose)));
        System.out.println("Choose word for searching :");
        //The only thing that came to me to get out of the loop is adding hasNextBoolean )))
        System.out.println("ATTENTION!!!! TO EXIT WORD SEARCHING, PLEASE TYPE true OR false");

        while (scanner.hasNextLine() && !scanner.hasNextBoolean()) {
            String word;
            String search = String.valueOf(ise.search(str, word = scanner.nextLine()));
            System.out.println(search);
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(result, true)))) {
                out.println("Book file path and name - " + choose + " , Interest word - " + word + " , Amount of repeated word - " + search);
            } catch (IOException e) {
                System.out.println("File read error");
            }
        }
        scanner.close();
    }
}
