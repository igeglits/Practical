package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class ListHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivan");
        map.put(888, "Mariya");
        map.put(999, "Nikolay");
        System.out.println(map);
        System.out.println(map.get(888));
        map.put(888, "Anna");
        System.out.println(map);
        map.remove(888);
        System.out.println(map);
        System.out.println(map.containsKey(777));
        System.out.println(map.containsValue("Ivan"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }
}
