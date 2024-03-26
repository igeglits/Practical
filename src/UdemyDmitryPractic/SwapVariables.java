package UdemyDmitryPractic;

public class SwapVariables {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;
        var temp = a;//сюда приходит двойка
        a = b;//здесь а получает 5
        b = temp;//здесь б получает двойку из 7-ой строки
        System.out.println(("a= " +a));
        System.out.println(("b= " +b));

    }
}
