package StreamFileAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String path = "input.txt";

        try {

            FileInputStream input = new FileInputStream(path);
            FileOutputStream output = new FileOutputStream("output3.txt");

            int read = input.read();

            while (read != -1) {

                String str = String.valueOf(read);

                if (str.equals("32") || str.equals("10")) {
                    output.write(read);

                } else {

                    for (int i = 0; i < str.length(); i++) {
                        output.write(str.charAt(i));
                    }

                }

                read = input.read();
            }

        } catch (IOException ignored) {
        }

    }


}

