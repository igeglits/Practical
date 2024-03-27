package twoStaticMethod;

class ForTwoStaticMethods {
    static final double pii = 3.14;

    static int raise(int a, int b, int c) {
        return a * b * c;
    }

    static void delete(int a, int b) {
        int c = a / b;

        System.out.printf(c + " ostatok= " + (a % b));
    }

    double circleCalculation(int r) {
        return pii * r * r;
    }

    static double circleLenght(int r) {
        return 2 * pii * r;
    }

    void resultPrint(int r) {
        var length = circleLenght(r);
        var square = circleCalculation(r);
        System.out.println("radius = " + r + '\n' + "ploshad = " + square + '\n' +
                "dlinna = " + length);
    }
}

class Dva {
    public static void main(String[] args) {
        ForTwoStaticMethods f = new ForTwoStaticMethods();
        System.out.println(ForTwoStaticMethods.raise(4, 6, 9));
        ForTwoStaticMethods.delete(7, 3);
        System.out.println();
        System.out.println(ForTwoStaticMethods.circleLenght(5));
        System.out.println(f.circleCalculation(5));
        f.resultPrint(5);
    }

}
