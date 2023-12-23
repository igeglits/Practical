package Recursion;


// Импортируем класс File для работы с файлами
import java.io.File;
import java.util.Objects;

// Создаем класс FindFile с главным методом main
public class FindFile {
    public static void main(String[] args) {
        // Задаем директорию, в которой будем искать файл
        String dir = "C:\\Users\\igegl\\IdeaProjects\\Practical";
        // Задаем имя файла, который хотим найти
        String query = "FindFile.java";

        // Вызываем метод findFile, передавая ему директорию и имя файла
        findFile(new File(dir), query);
    }

    // Создаем метод findFile, который принимает объект File и строку
    private static void findFile(File dir, String fileName) {
        // Получаем массив всех файлов и директорий в текущей директории
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            // Если текущий элемент является директорией, то рекурсивно вызываем метод findFile для нее
            if (file.isDirectory()) {
                findFile(file, fileName);
                // Если текущий элемент является файлом, то сравниваем его имя с искомым
            } else if (file.isFile()) {
                if (fileName.equals(file.getName())) {
                    // Если нашли совпадение, то выводим абсолютный путь к файлу
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
