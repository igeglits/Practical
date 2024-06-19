package functionInterface;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        list.forEach(System.out::println);
    }
}
