package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Укажите путь к вашему файлу
        String filePath = "src/War of the Worlds.txt"; // Поменяйте на путь к вашему файлу
        // Список интересующих слов
        Set<String> targetWords = new HashSet<>();
        targetWords.add("теперь");
        targetWords.add("марсианин");
        targetWords.add("знает");
        targetWords.add("джава");
        targetWords.add("хуже");
        targetWords.add("тебя");
        // Создаем словарь для хранения количества интересующих слов
        Map<String, Integer> wordCount = countSpecificWords(filePath, targetWords);

        // Вывод результата
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Integer> countSpecificWords(String filePath, Set<String> targetWords) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Используем BufferedReader для чтения файла с кодировкой CP1251
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath), Charset.forName("windows-1251"))) {
            String line;
            // Регулярное выражение для русских слов
            Pattern pattern = Pattern.compile("[а-яё]+", Pattern.CASE_INSENSITIVE);
            while ((line = br.readLine()) != null) {
                // Приводим строку к нижнему регистру
                line = line.toLowerCase();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String word = matcher.group();
                    // Проверяем, если слово в списке интересующих слов
                    if (targetWords.contains(word)) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }
}