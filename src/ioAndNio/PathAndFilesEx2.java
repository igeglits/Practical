package ioAndNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\igegl\\IdeaProjects\\Udemy_Zaur_Oracle\\src\\ioAndNio");

        //Files.copy(filePath, directoryPath.resolve(filePath));
        //Files.copy(filePath, directoryPath.resolve("test16.txt"));
        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied");
    }
}
