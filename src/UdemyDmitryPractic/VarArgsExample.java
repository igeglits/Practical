package UdemyDmitryPractic;

public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println(concat());
        System.out.println(concat("hello"));
        System.out.println(concat("hello", "World"));
        System.out.println(concat("Hello", " ", "world", "!"));
    }
    private static String concat(String...args) {//аргументы должны быть лишь одного типа, здесь только Стринг
        StringBuilder builder = new StringBuilder();// так же перегружать эту функцию нельзя
        for (String arg : args) {//
            builder.append(arg);
        }
        return builder.toString();
    }
        private static String concat(int a, boolean t, String...args){// при создании функции где есть еще кроме опциональных переменных
            //обязательные, то опциональные ставятся последними
        StringBuilder builder=new StringBuilder();
        for (String arg : args){//
            builder.append(arg);
        }
        return builder.toString();
    }
}
