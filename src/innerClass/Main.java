package innerClass;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        String [] list = {"bread", "meat", "egg", "sausage"};

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        };

        Arrays.sort(list, comparator);

        for (String dish : list) {
            System.out.print(dish + " ");
        }
    }
}
