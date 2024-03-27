package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MethodListOf {
    public static void main(String[] args) {
        // Create an arrayList object
        ArrayList<String> arrayList1 = new ArrayList<>();
        // Add elements to the arrayList
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        // Print the arrayList
        System.out.println("arrayList1: " + arrayList1);
        // Create an arrayList object
        ArrayList<String> arrayList2 = new ArrayList<>();
        // Add elements to the arrayList
        arrayList2.add("Ivan");
        arrayList2.add("Elena");
        arrayList2.add("Zaur");
        arrayList2.add("Anna");
        // Print the arrayList
        System.out.println("arrayList2: " + arrayList2);
        // Create a List object
        List<String> list = List.of("Ivan", "Elena", "Zaur", "Anna");// List.of() returns an immutable list
        //добавить в list элемент нельзя, т.к. он неизменяемый, нельзя добавлять null
        // Check if the arrayList contains all elements of the List
        boolean result = arrayList1.containsAll(list);
        // Print the result
        System.out.println("arrayList1 contains all elements of list: " + result);

    }
}
