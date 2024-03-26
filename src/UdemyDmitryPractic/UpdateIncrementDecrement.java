package UdemyDmitryPractic;

public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        //теперь присваивание с обновлением
        a = a + 1;
        System.out.println(a);
        //тоже самое
        a += 1;
        System.out.println(a);
        //и еще тоже самое но короче, увеличения на единицу, это есть Increment
        // с минусом а-- будет Decrement
        a++;
        System.out.println(a);

        a *= 2;
        a = a * 2;
        a /= 3;
        a = a / 3;

    }
}
