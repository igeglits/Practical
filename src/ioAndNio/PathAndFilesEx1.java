package ioAndNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) {
        Path filePath = Path.of("test15.txt");
        Path directoryPath = Path.of("C:\\Users\\igegl\\IdeaProjects\\Udemy_Zaur_Oracle\\src\\ioAndNio");
        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Directory name: " + directoryPath.getFileName());
        System.out.println("File root: " + filePath.getRoot());
        System.out.println("Directory root: " + directoryPath.getRoot());
        System.out.println("File parent: " + filePath.getParent());
        System.out.println("Directory parent: " + directoryPath.getParent());
        System.out.println("File absolute path: " + filePath.toAbsolutePath());
        System.out.println("Directory absolute path: " + directoryPath.toAbsolutePath());
        System.out.println("File normalized path: " + filePath.normalize());
        System.out.println("Directory normalized path: " + directoryPath.normalize());
        System.out.println("File absolute path + getParent: " + filePath.toAbsolutePath().getParent());
        System.out.println("File absolute path + getRoot: " + filePath.toAbsolutePath().getRoot());
        System.out.println("File absolute path + getFileName: " + filePath.toAbsolutePath().getFileName());
        System.out.println("File absolute path + getNameCount: " + filePath.toAbsolutePath().getNameCount());
        System.out.println("File absolute path + getName(0): " + filePath.toAbsolutePath().getName(0));
        System.out.println("File absolute path + getName(1): " + filePath.toAbsolutePath().getName(1));
        System.out.println("File absolute path + getName(2): " + filePath.toAbsolutePath().getName(2));
        System.out.println("File absolute path + getName(3): " + filePath.toAbsolutePath().getName(3));
        System.out.println("File absolute path + subpath(0, 2): " + filePath.toAbsolutePath().subpath(0, 2));
        System.out.println("File absolute path + subpath(1, 3): " + filePath.toAbsolutePath().subpath(1, 3));
        System.out.println("File absolute path + subpath(0, 3): " + filePath.toAbsolutePath().subpath(0, 3));
        System.out.println("File absolute path + subpath(1, 2): " + filePath.toAbsolutePath().subpath(1, 2));
        System.out.println("File absolute path + subpath(2, 3): " + filePath.toAbsolutePath().subpath(2, 3));
        System.out.println("File absolute path + subpath(0, 1): " + filePath.toAbsolutePath().subpath(0, 1));


        /*if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }*/
        System.out.println("Readable? " + Files.isReadable(filePath));
        System.out.println("Writable? " + Files.isWritable(filePath));
        System.out.println("Executable? " + Files.isExecutable(filePath));

        Path filePath2 = Paths.get("C:\\Users\\igegl\\IdeaProjects\\Udemy_Zaur_Oracle\\test15.txt");
        try {
            System.out.println("Same files? "+ Files.isSameFile(filePath, filePath2))  ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(" Size " + Files.size(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("Attribute " + Files.getAttribute(filePath, "creationTime"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Map<String, Object> attributes = Files.readAttributes(filePath, "*");
           for(Map.Entry<String,Object> entry : attributes.entrySet()) {
               System.out.println(entry.getKey() + " : " + entry.getValue());
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("File store: " + Files.getFileStore(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

