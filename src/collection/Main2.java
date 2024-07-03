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
        // ������� ���� � ������ �����
        String filePath = "src/poem.txt"; // ��������� �� ���� � ������ �����

        // ��� ��� �������� ���������� ����
        Set<String> uniqueWords = extractUniqueWords(filePath);

        // ����� ���������� ����
        uniqueWords.forEach(System.out::println);

        // ������ ������ ������ �������������
        System.out.println("\n������ �������������:");
        String poem = generatePoem(uniqueWords, 10); // 10 - ���������� ���� � ������ �������������
        System.out.println(poem);

        // �������������� ����� �������������
        System.out.println("\n������� ������ �������������: ������");
    }

    public static Set<String> extractUniqueWords(String filePath) {
        Set<String> uniqueWords = new LinkedHashSet<>();

        // ���������� BufferedReader ��� ������ ����� � ���������� CP1251
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath), StandardCharsets.UTF_8)) {
            String line;
            // ���������� ��������� ��� ������� ����
            Pattern pattern = Pattern.compile("[�-��]+", Pattern.CASE_INSENSITIVE);
            while ((line = br.readLine()) != null) {
                // �������� ������ � ������� ��������
                line = line.toLowerCase();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    // ��������� ����� � ��������� ��� � Set
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

