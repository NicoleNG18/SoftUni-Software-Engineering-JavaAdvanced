package StreamFileAndDirectories.exercise;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming" +
                "\\Java Advanced\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-" +
                "Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\inputex.txt";
        ;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));
            PrintWriter writer = new PrintWriter(String.valueOf(new FileWriter("src\\outputallcapitals.txt")));

            String line = reader.readLine();

            while (line != null) {

                String newLine = line.toUpperCase();

                writer.println(newLine);
                writer.close();

                line = reader.readLine();
            }

            writer.close();
        } catch (IOException ignored) {
        }

    }


}

