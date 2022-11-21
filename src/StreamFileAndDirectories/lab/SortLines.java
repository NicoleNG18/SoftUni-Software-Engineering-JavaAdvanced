package StreamFileAndDirectories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        List<String> sorted = Files.readAllLines(Path.of(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Path outputPath = Path.of("output6.txt");

        Path write = Files.write(outputPath, sorted);

    }


}

