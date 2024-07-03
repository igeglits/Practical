package fileReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Укажите путь к вашему файлу
        String filePath = "src/War_and_Peace.txt";

        // Подсчет букв "а"
        int count = countRussianLetterA(filePath);

        // Вывод результата
        System.out.println("Количество русских букв 'а' в файле: " + count);
    }

    public static int countRussianLetterA(String filePath) {
        int count = 0;

        try (FileReader fr = new FileReader(filePath)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                // Проверяем, является ли символ русским "а" или "А"
                /*if (isRussianLetterA((char) ch)) {
                    count++;
                }*/
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    // Метод для проверки, является ли символ русской буквой "а" или "А"
    private static boolean isRussianLetterA(char ch) {
        // Диапазон для русских букв "а" и "А"
        return ch == '\u0430' || ch == '\u0410';
    }
}



