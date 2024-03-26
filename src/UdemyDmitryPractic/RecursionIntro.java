package UdemyDmitryPractic;

class RecursionIntro {
    public static void main(String[] args) {
        function1(10);//вход в рекурсию
        System.out.println("из рекурсии вышли");
    }

    private static void function1(int count) {
        if (count > 0) {
            System.out.println("заполняем стек вызова функции "+count);
            function1(count - 1);
        }
        System.out.println("очищаем стек вызова функции "+count);
    }
}
