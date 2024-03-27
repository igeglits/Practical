package udemyDmitryPractic;

public class TypeCast {
    public static void main(String[] args) {
        //преобразование типов
        String is = String.valueOf(1);//преобразование данных в строку через valueOff
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello " + 1 + 1.1 + true + 'a');//это возможно если слева от данных указан текст в кавычках

        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);//получаем символ по нулевому индексу, индексация начинается с нуля.
        char ch2 = "abc".charAt(1);
        System.out.println(ch1);
        System.out.println(ch2);
        //
        char ch = 2;//число = размеру байтов
        int i = 4;
        double d = 8;

        d = i;//влезет т.к. в дабл 8 байтов
        d = ch;//тоже влезет т.к. в дабл 8 байтов, потому можно просто использовать оператор присваивания.
        i = ch;//в обратном направлении присвоение не получится.
        //i = d не получится, надо делать так ==>
        i = (int) d;
        ch = (char) d;//обрезаются лишние байты
        ch = (char) i;
        System.out.println(d);
        System.out.println(i);

        //булеан можно привести только к строчному выражению
        boolean b = true;
        System.out.println(b);

    }
}
