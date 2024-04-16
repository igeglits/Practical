package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

    List<String> collect(List<String> list){
        return list.stream()
                .map(this::toUpperCase)
                .filter(s -> s.contains("N"))
                .collect(Collectors.toList());

    }

    private String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {
            {
                add("Ivan");
                add("Mariya");
                add("Nikolay");

            };
        };
        ListStream listStream = new ListStream();
        listStream.collect(list).forEach(System.out::println);
    }
}
