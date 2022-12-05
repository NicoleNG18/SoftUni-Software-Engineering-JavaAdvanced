package StreamFileAndDirectories.exercise;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming\\Java Advanced" +
                "\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));

             PrintWriter write = new PrintWriter("outputLines.txt")) {

            String line = reader.readLine();

            int count = 1;

            while (line != null) {

                StringBuilder sb = new StringBuilder();

                sb.append(count);
                sb.append(". ");
                sb.append(line);

                write.println(sb.toString());

                count++;

                line = reader.readLine();
            }

        } catch (IOException ignored) {

        }

    }


}

