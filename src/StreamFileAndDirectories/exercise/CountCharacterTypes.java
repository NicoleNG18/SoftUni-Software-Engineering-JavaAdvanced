package StreamFileAndDirectories.exercise;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\nikol\\OneDrive\\Работен плот\\programming\\Java Advanced" +
                "\\StreamFileDirectory\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputex.txt";

        String outputPath = "outputChar.txt";

        int vowelsCount = 0;
        int consonantsCount = 0;

        int punctCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));

             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            String currentLine = reader.readLine();

            while (currentLine != null) {

                for (int i = 0; i < currentLine.length(); i++) {

                    char ch = currentLine.charAt(i);
                    if (ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) {
                        vowelsCount++;

                    } else if (ch == 33 || ch == 46 || ch == 63 || ch == 44) {
                        punctCount++;

                    } else if (ch != 32) {
                        consonantsCount++;
                    }

                }

                currentLine = reader.readLine();
            }

            writer.println("Vowels: " + vowelsCount);
            writer.println("Consonants: " + consonantsCount);
            writer.println("Punctuation: " + punctCount);

        } catch (IOException ignored) {

        }

    }


}

