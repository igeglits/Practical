package UdemyDmitryPractic;

public class InvokeStack {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        function1(a, b);
        function2(a, b);//опять вызывает функцию 2
    }

    private static void function1(int a, int c) {
        int b = 0;
        function2(a, b);//вызываем функцию 2 из функции 1
    }

    private static void function2(int a, int b) {
        System.out.println(a / b);//получаем деление на ноль, можно отследить цепочку появления ошибки в Ран
    }
}
