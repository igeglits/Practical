package Exeptions;

import java.io.*;


class FileProcess {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\igegl\\IdeaProjects\\Practical\\src\\Exeptions\\exeptions.txt"); //компилятор и рантайм не проверяют. есть ли такой файл на самом деле.
    FileInputStream fileInputStream = new FileInputStream(f);
    fileInputStream.read();
    FileOutputStream fileOutputStream = new FileOutputStream(f);
    fileOutputStream.write(100);
    }
}
