package interfaces;

public class Main implements MyInterface {
    public static void main(String[] args) {
        Main main = new Main();
        main.myOne();
        main.myTwo();
        MyInterface.myThree();

    }

    @Override
    public void myOne() {
        MyInterface.super.myOne(); // вызов default-метода из интерфейса
    }

    @Override
    public void myTwo() {
        System.out.println("two");
    }
}

interface MyInterface {
    default void myOne() {
        System.out.println("one");
    }

    void myTwo();

    static void myThree() {
        System.out.println("three");
    }
}
