package stringJoiner;

import java.util.StringJoiner;

public class Main{
    public static void main(String[] args) {
        String phrase = "my,dear,darling";

        //исправьте с этого места
        StringJoiner joiner = new StringJoiner(" ", "Hello ", " friend!");
        for (String s : phrase.split(",")) {
            joiner.add(s);
        }
        System.out.println(joiner);
    }
}