package jeneric;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("London");
       // printList(list);
    }

    static void printList(List<Object> list) {
        System.out.println(list.get(0));
    }
}