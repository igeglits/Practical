package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringParametersToReturnInSortedUniqueList {
    public static void main(String[] args) {
        String[] parameters = { "g", "h", "i", "j", "k", "l", "g", "h", "a", "b", "c", "a", "b", "c", "d", "e", "f"};
        addAndSort(parameters);
    }

    private static void addAndSort(String[] parameters) {
        ArrayList<String> list = new ArrayList<>();
        for (String parameter : parameters) {
            if (!list.contains(parameter)) {
                list.add(parameter);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
