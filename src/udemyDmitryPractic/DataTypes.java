package udemyDmitryPractic;

public class DataTypes {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(Integer.MIN_VALUE + " < i <  " + Integer.MAX_VALUE);

        double d = 0.1;
        System.out.println(Double.MIN_VALUE + " < i <  " + Double.MAX_VALUE);

        boolean b1 = true;
        boolean b2 = false; //только такие значения у булеан

        char ch = 'g';//символьный тип данных. использует unicode-table.com
        System.out.println(Character.MIN_VALUE + ch + Character.MAX_VALUE);
        System.out.println((int) ch);//видим номер из таблицы для символа

        String s = "Hello World"; //строковый тип, хранит целую строку.
        System.out.println(s);
    }
}
