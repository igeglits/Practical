package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        // Укажите путь к вашему файлу
        String filePath = "src/poem.txt"; // Поменяйте на путь к вашему файлу

        // Сет для хранения уникальных слов
        Set<String> uniqueWords = extractUniqueWords(filePath);

        // Вывод уникальных слов
        uniqueWords.forEach(System.out::println);

        // Пример вывода начала стихотворения
        System.out.println("\nНачало стихотворения:");
        String poem = generatePoem(uniqueWords, 10); // 10 - количество слов в строке стихотворения
        System.out.println(poem);

        // Предполагаемый автор стихотворения
        System.out.println("\nФамилия автора стихотворения: Пушкин");
    }

    public static Set<String> extractUniqueWords(String filePath) {
        Set<String> uniqueWords = new LinkedHashSet<>();

        // Используем BufferedReader для чтения файла с кодировкой CP1251
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath), StandardCharsets.UTF_8)) {
            String line;
            // Регулярное выражение для русских слов
            Pattern pattern = Pattern.compile("[а-яё]+", Pattern.CASE_INSENSITIVE);
            while ((line = br.readLine()) != null) {
                // Приводим строку к нижнему регистру
                line = line.toLowerCase();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    // Извлекаем слово и добавляем его в Set
                    String word = matcher.group();
                    uniqueWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uniqueWords;
    }

    public static String generatePoem(Set<String> words, int wordCount) {
        StringBuilder poem = new StringBuilder();
        int count = 0;
        for (String word : words) {
            poem.append(word).append(" ");
            if (++count >= wordCount) {
                break;
            }
        }
        return poem.toString().trim();
    }
}

