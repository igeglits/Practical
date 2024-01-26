package UdemyDmitryPractic;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        char[] charArray = string.toCharArray();
        int[] numbers = new int[string.length()];
        int count = 0;
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            var c = charArray[i];
            if (Character.isDigit(c)) {
                numberBuilder.append(c);
            } else if (!numberBuilder.isEmpty()){
                numbers[count++] = Integer.parseInt(numberBuilder.toString());
                numberBuilder.setLength(0);
            }
        }
        //зайдя на последний круг с последним символом цикл после проверки не придет на 26 строку, ее надо повторить после цикла для последнего стрингбилдера
        if (!numberBuilder.isEmpty())
            numbers[count++] = Integer.parseInt(numberBuilder.toString());

/*return Arrays.stream(numbers)
        .map(numbers::)
        .collect(Collectors.toList());*/
      return trimArray(numbers, count);

    }

    private static int[] trimArray(int[] array, int count) {
int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i]=array[i];
        }
        return result;
    }
}
