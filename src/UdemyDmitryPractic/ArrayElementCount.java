package UdemyDmitryPractic;

public class ArrayElementCount {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;
        var sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                sum += element;
            }
        }
        System.out.println(sum / element);
        var count = 0;
        for (int i : array) {
            if (i == element) {
                count++;//включает счетчик
            }
        }
        System.out.println(count);
    }
}
