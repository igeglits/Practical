package UdemyDmitryPractic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class FindPopularWord {


    public static void main(String[] args) {
        String text = "I am a student and I am learning Java. Java is a popular programming language. Java is used in many applications.";
        FindPopularWord findPopularWord = new FindPopularWord();
        findPopularWord.countWordRepeat(text);
    }


    private void countWordRepeat(String text) {
        List<CountedWords> list = new ArrayList<>();
        String[] words = splitStringToArray(text);

        int counters = 1;
        for (int i = 1; i < words.length; i++) {
            String s = words[i];
            var startingWord = words[0];
            if (startingWord.equalsIgnoreCase(s)) {
                counters++;
            }

        }
        addToListCountedWords(list, counters, words[0]);
        counters = 1;

        for (int i = 1; i < words.length; i++) {
            String s = words[i];
            for (var list1 : list) {
                if (!s.equalsIgnoreCase(list1.getWord())) {
                    for (String word : words) {
                        if (s.equalsIgnoreCase(word)) {
                            counters++;
                        }
                    }
                }
                addToListCountedWords(list, counters, s);
                counters = 1;
            }
        }
        getAndPrintPopularWord(list);
    }

    private String[] splitStringToArray(String text) {
        String[] words = text.split(" ");
        return words;
    }

    private void addToListCountedWords(List<CountedWords> list, int counters, String word) {
        list.add(new CountedWords(counters, word));
    }

    private void getAndPrintPopularWord(List<CountedWords> list) {
        list.stream()
                .max(Comparator.comparingInt(countedWords -> countedWords.getCounter()))
                .ifPresent(entry -> System.out.println(entry.getCounter() == 1 ?
                        "All words in the text are unique." :
                        "Word with the highest count: " + entry.getWord() + " " + entry.getCounter() + " times"));

    }
}

class CountedWords {
    private int counter;
    private String word;

    public int getCounter() {
        return counter;
    }

    public String getWord() {
        return word;
    }

    public CountedWords(int counter, String word) {
        this.counter = counter;
        this.word = word;
    }
}
