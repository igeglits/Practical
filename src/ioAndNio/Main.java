package ioAndNio;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String newLine = scanner.nextLine();
        System.out.println(newLine);
    }

    private static void replacInputStream() {
        String city = "London";

        // класс InputStream, обертка ByteArrayInputStream в которую передаем массив байт
        InputStream is = new ByteArrayInputStream(city.getBytes());

        // заменяем значение статической переменной in
        System.setIn(is);
    }

    static {
        replacInputStream();
    }

}
