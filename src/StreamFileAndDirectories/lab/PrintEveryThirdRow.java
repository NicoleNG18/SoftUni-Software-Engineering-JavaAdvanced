package StreamFileAndDirectories.lab;

import java.io.*;

public class PrintEveryThirdRow {
    public static void main(String[] args) {
        String path = "input.txt";

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output5.txt")));

            int count = 0;
            String currentLine = reader.readLine();

            while (currentLine != null) {
                count++;

                if (count % 3 == 0) {
                    write.write(currentLine);
                    write.newLine();
                }

                currentLine = reader.readLine();
            }

            write.close();

        } catch (IOException ignored) {
        }

    }


}

