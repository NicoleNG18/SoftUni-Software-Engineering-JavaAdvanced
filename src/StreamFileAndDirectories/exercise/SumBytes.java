package StreamFileAndDirectories.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming\\Java Advanced" +
                "\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputex.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = reader.readLine();

        int sum = 0;

        while (line != null) {

            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }

            line = reader.readLine();
        }

        System.out.println(sum);
    }


}

