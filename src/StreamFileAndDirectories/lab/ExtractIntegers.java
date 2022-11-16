package StreamFileAndDirectories.lab;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegers {
    public static void main(String[] args) {
        String path = "input.txt";

        try {
            Scanner reader = new Scanner(new FileInputStream(path));

            PrintWriter out = new PrintWriter(new FileOutputStream("output4.txt"));

            String line = reader.nextLine();

            Pattern pattern = Pattern.compile(" ([0-9]+) ");

            while (reader.hasNextLine()) {

                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {

                    StringBuilder sb = new StringBuilder(String.valueOf(matcher.group(0)));

                    sb.deleteCharAt(0);
                    sb.deleteCharAt(sb.length() - 1);

                    out.println(Integer.parseInt(String.valueOf(sb)));

                }

                line = reader.nextLine();
            }

            out.close();

        } catch (IOException ignored) {
        }

    }


}

