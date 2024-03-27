package importClassToClass.p4;

import importClassToClass.p1.A;


import static importClassToClass.p1.p2.B.*;
import importClassToClass.p1.p2.B;
class D {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a);
        var result = a + a1.a;
        B b1= new B();
        b1.printB(result);
    }
}
