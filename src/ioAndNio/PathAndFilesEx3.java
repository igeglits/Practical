package ioAndNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("test17.txt");
        /*Files.createFile(filePath);
        String dialog = "Hello, Igor!\nHow are you?\nI am fine!";
        Files.write(filePath, dialog.getBytes());*/

        Files.readAllLines(filePath).forEach(System.out::println);
        List<String> list =  Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
