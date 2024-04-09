package factorial;

public class FactorialCycle {
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    private static int factorial(int i) {
        var result = 10;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        return result;
    }
}

