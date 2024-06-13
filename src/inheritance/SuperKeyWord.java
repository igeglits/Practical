package inheritance;

class SuperKeyWord {
    String s1= "Hello";
    static double d1 = 3.14;

    int summa (int...i){
        int result = 0;
        for(int a:i){
            result +=a;
        }
        return result;
    }
    static void abc() {
        System.out.println("static method");
    }
}
class B extends SuperKeyWord{
    String s1 = super.s1 + " World";
    double d1 = super.d1;
int summa (int...i){
    int result = super.summa(i);
    System.out.println("Summa = " + result);
    super.abc();
    return result;
}
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.s1);
        b.summa(1,2,3,4,5);

    }
}

