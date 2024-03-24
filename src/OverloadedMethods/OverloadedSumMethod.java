package OverloadedMethods;

class OverloadedSumMethod {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    OverloadedSumMethod(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    OverloadedSumMethod(int a, int b, int c, int d) {
        this(a, b, c, d, 0);

    }

    OverloadedSumMethod(int a, int b, int c) {
        this(a, b, c, 0, 0);

    }

    OverloadedSumMethod(int a, int b) {
        this(a, b, 0, 0, 0);

    }

    OverloadedSumMethod(int a) {
        this(a, 0, 0, 0, 0);

    }

    OverloadedSumMethod() {

    }
}

class OverloadedSumMethodTest {
    public static void main(String[] args) {
        OverloadedSumMethod overloadedSumMethod = new OverloadedSumMethod(0, 1, 2, 3, 4);
        System.out.println(overloadedSumMethod.a +
                overloadedSumMethod.b +
                overloadedSumMethod.c +
                overloadedSumMethod.d +
                overloadedSumMethod.e);
        OverloadedSumMethod overloadedSumMethod1 = new OverloadedSumMethod();

        OverloadedSumMethod overloadedSumMethod2 = new OverloadedSumMethod(0);
        System.out.println(overloadedSumMethod2.a+ overloadedSumMethod.e);


    }
}
