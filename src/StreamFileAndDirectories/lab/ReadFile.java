package StreamFileAndDirectories.lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "input.txt";

        try {

            FileInputStream fileStream = new FileInputStream(path);

            int read = fileStream.read();

            while (read != -1) {
                System.out.print(Integer.toBinaryString(read) + " ");
                read = fileStream.read();
            }

        } catch (IOException ignored) {
        }

    }


}

