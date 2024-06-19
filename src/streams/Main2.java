package streams;

import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        IntStream evenStream = IntStream.iterate(0, i -> i + 2)
                .limit(6);
        evenStream.forEach(System.out::println);
    }
}

