package StreamFileAndDirectories.exercise;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class FolderSize {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\nikol\\OneDrive" +
                "\\Работен плот\\programming" +
                "\\Java Advanced\\StreamFileDirectory" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources");

        Deque<File> folders = new ArrayDeque<>();

        folders.offer(folder);

        while (!folders.isEmpty()) {
            File currentFile = folders.poll();
        }

    }


}

