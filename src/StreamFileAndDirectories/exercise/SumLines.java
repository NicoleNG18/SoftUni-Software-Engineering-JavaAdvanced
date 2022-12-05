package StreamFileAndDirectories.exercise;

import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming" +
                "\\Java Advanced\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputex.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String currentLine = reader.readLine();

        while (currentLine != null) {

            int sum = 0;

            for (int i = 0; i < currentLine.length(); i++) {
                sum += currentLine.charAt(i);
            }

            System.out.println(sum);

            currentLine = reader.readLine();
        }

    }

}


