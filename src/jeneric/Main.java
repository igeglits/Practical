package jeneric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("London");
        printLondon(cities);
        printBerlin(cities);
    }

    static void printLondon(List<?> list) {
        System.out.println(list.get(0));
    }

    static void printBerlin(List<String> list) {
        list.add("Berlin");
        System.out.println(list.get(1));
    }
}
