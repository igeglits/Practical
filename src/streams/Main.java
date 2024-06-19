package streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);
        list.stream()
                .sorted()
                .toArray();
        System.out.println(list);
    }
}