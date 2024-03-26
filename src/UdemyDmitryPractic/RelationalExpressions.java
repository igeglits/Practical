package UdemyDmitryPractic;

public class RelationalExpressions {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        System.out.println(a == b);//сравнение двух переменных
        System.out.println(a != b);//а не равняется б
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        var c = a == b;//результат будет помещен в переменную логического типа
        System.out.println(c);
    }
}
