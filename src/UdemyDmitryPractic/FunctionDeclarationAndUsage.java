package UdemyDmitryPractic;

public class FunctionDeclarationAndUsage {
    public static void main(String[] args) {
        int res = sumOf(2, 3);//использование объявленной функции или ее вызов
        System.out.println(res);
    }

    private static int sumOf(int a, int b) {//это есть объявление функции
        return a + b;
    }
}
