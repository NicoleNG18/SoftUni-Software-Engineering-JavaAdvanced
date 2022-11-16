package StreamFileAndDirectories.lab;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class ListFiles {
    public static void main(String[] args) {

        String path = "C:\\Users\\nikol\\OneDrive\\Работен плот" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams";

        File files = new File(path);

        Arrays.stream(Objects.requireNonNull(files.listFiles()))
                .filter(File::isFile)
                .forEach(e -> System.out.println(e.getName() + ": [" + e.length() + "]"));

    }


}

