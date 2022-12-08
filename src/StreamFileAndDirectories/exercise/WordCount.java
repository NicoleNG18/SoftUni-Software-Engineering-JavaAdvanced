package StreamFileAndDirectories.exercise;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String firstInput = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming\\Java Advanced" +
                "\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        String secondInput = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming\\Java " +
                "\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        try (Scanner scan = new Scanner(new FileReader(firstInput));

             Scanner textScanner = new Scanner(new FileReader(secondInput));

             PrintWriter print = new PrintWriter(new FileWriter("src\\wordcount.txt"))) {

            Map<String, Integer> wordsWithCount = new LinkedHashMap<>();

            Arrays.stream(scan.nextLine().split("\\s+"))
                    .forEach(word -> wordsWithCount.putIfAbsent(word, 0));

            while (textScanner.hasNext()) {

                String currentWord = textScanner.next();

                if (wordsWithCount.containsKey(currentWord)) {
                    wordsWithCount.put(currentWord, wordsWithCount.get(currentWord) + 1);
                }

            }

            for (var entry : wordsWithCount.entrySet()) {
                print.println(entry.getKey() + " - " + entry.getValue());
            }

        } catch (IOException ignored) {

        }

    }


}

