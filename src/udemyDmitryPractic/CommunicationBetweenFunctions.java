package udemyDmitryPractic;

public class CommunicationBetweenFunctions {
    public static void main(String[] args) {
        int a = 9;
        function1(a);
        System.out.println(a);
    }

    private static void function1(int a) {
        a++;
        System.out.println(a);
    }
}
