package udemyDmitryPractic;

public class FindMinString {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        String min = array[0];
        for (int i = 1; i < array.length; i++) {
           if (min.compareToIgnoreCase(array[i])>0) {
                System.out.println(min.compareToIgnoreCase(array[i]));
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
