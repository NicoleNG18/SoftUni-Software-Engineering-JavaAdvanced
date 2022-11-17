package StreamFileAndDirectories.lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class NestedFolders {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikol\\OneDrive\\Работен плот\\" +
                "04. Java-Advanced-Streams-Files-and-Directories-Resources." +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams";

        File file = new File(path);

        System.out.println(Files.walk(file.toPath())
                .map(Path::toFile)
                .map(File::getName)
                .collect(Collectors.joining(System.lineSeparator())));

    }


}

