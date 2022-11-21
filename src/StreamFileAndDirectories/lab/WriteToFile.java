package StreamFileAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {
        String path = "input.txt";

        try {

            FileOutputStream outputStream = new FileOutputStream("output.txt");
            FileInputStream inputStream = new FileInputStream(path);

            int read = inputStream.read();

            Set<Character> punctuations = Set.of(',', '.', '!', '?');

            while (read != -1) {

                if (!punctuations.contains((char) read)) {
                    outputStream.write(read);
                }

                read = inputStream.read();
            }

        } catch (IOException ignored) {
        }

    }


}

