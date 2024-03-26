package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MethodListCopyOf {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        List<String> list = List.copyOf(arrayList1);
        System.out.println("list: " + list);
    }
}
