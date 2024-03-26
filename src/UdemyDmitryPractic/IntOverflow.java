package UdemyDmitryPractic;

public class IntOverflow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE;
            System.out.println(i);
            System.out.println(i + 1);//получили отрицательное значение
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println(i - 1);//получили положительное число
        }
    }
}
/* это называется переполнение разряда, потому так получили такую коллизию
В ячейке не хватает места для хранения
long g;
BigInteger b = new BihInteger(""); сохраняет любое число любого размера, пока хватает памяти
*/
