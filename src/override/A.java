package override;

class A {
    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{
    void abc(B b){//этот метод не перезаписан, это новый метод с другим параметром, в этом классе 2-а метода с одинаковыми именами
        System.out.println("B");
    }
}
class C extends B{
    void abc(B b2){//этот метод перезаписан, сигнатура одинакова.
        System.out.println("C");
    }
}
class Mainmain {
    public static void main(String[] args) {
       A c1= new C();
       c1.abc(new B());//вызываем метод из класса А
    }
}
