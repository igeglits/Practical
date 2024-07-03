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
        // ������� ���� � ������ �����
        String filePath = "src/War of the Worlds.txt"; // ��������� �� ���� � ������ �����
        // ������ ������������ ����
        Set<String> targetWords = new HashSet<>();
        targetWords.add("������");
        targetWords.add("���������");
        targetWords.add("�����");
        targetWords.add("�����");
        targetWords.add("����");
        targetWords.add("����");
        // ������� ������� ��� �������� ���������� ������������ ����
        Map<String, Integer> wordCount = countSpecificWords(filePath, targetWords);

        // ����� ����������
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Integer> countSpecificWords(String filePath, Set<String> targetWords) {
        Map<String, Integer> wordCount = new HashMap<>();

        // ���������� BufferedReader ��� ������ ����� � ���������� CP1251
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath), Charset.forName("windows-1251"))) {
            String line;
            // ���������� ��������� ��� ������� ����
            Pattern pattern = Pattern.compile("[�-��]+", Pattern.CASE_INSENSITIVE);
            while ((line = br.readLine()) != null) {
                // �������� ������ � ������� ��������
                line = line.toLowerCase();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String word = matcher.group();
                    // ���������, ���� ����� � ������ ������������ ����
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