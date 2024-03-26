package UdemyDmitryPractic;

public class TernaryOperator {
    public static void main(String[] args) {
        var a = 6;
        if (a == 5) {
            System.out.println("a == 5");
        } else {
            System.out.println("a != 5");
        }//это все можно заменить тернарным синтаксисом
        System.out.println(a == 5 ? "a == 5" : "a != 5");
    }

}
