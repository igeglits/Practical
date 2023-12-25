package UdemyDmitryPractic;

import java.util.Arrays;

class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        // processing
        int[] numbers = extractNumbersFromString(string);
        // display results
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] extractNumbersFromString(final String string) {
        // Your implementation must be here
        return null;
    }
}
