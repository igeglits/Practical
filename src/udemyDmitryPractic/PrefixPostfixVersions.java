package udemyDmitryPractic;

public class PrefixPostfixVersions {
    public static void main(String[] args) {
        var a = 0;
        ++a;
        a++;
        System.out.println(a);

        var b = a++;//var b = a; a = a+1; сначала а присвоилась к б (2), потом а увеличилась на 1 и стала (3)
        System.out.println();
        System.out.println(b);
        System.out.println(a);

        var c = ++a;//a = a + 1; var c = a; сначала а увеличилась на 1 потом сумма присвоилась к c
        System.out.println();
        System.out.println(a);
        System.out.println(c);
    }
}
