package jeneric;

import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Boy> boys = Arrays.asList(new Boy(), new Boy());
        List<Parent> girls = Arrays.asList(new Girl(), new Girl());
        System.out.println(isMatch(boys, girls));
    }

    static class Parent {}

    static class Boy extends Parent {}

    static class Girl extends Parent {}

    static boolean isMatch(List<Boy> list1, List<Parent> list2) {
        return !(list1.get(0).getClass() == list2.get(0).getClass());
    }
}
