package ioAndNio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\igegl\\IdeaProjects\\Udemy_Zaur_Oracle\\src\\ioAndNio\\test16.txt");
            int character;
            while ((character = reader.read())!=-1) {// -1 - конец файла (end of file)
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }

    }
}
