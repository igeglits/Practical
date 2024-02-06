package Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class TwoFileStreams {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("C:\\Users\\igegl\\IdeaProjects\\Practical\\src\\Exeptions\\exeption2.txt");
            System.out.println("файл exeption2.txt найден");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("проблема с fis2 стримом");
            }
        } catch (FileNotFoundException e) {
            System.out.println("exeption2.txt не найден");
        } catch (NullPointerException e) {
            System.out.println("NullPointer сработал");
        }
    }
}

