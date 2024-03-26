package UdemyDmitryPractic;

public class PrintReverseString {
    public static void main(String[] args) {
        String s ="!dlrow olleH";
        for (int i = s.length()-1; i >=0; i--) {//i = s.length()-1; i >=0; i-- т.к. выводим в обратном порядке
            //длина строки = 12 (от единицы), а индекс самый большой = 11 (от нуля), потому s.length()-1
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
