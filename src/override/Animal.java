package override;

class Animal {
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal {
    @Override
    void getName(){
        System.out.println("Mouse");
    }
}
class Main {
    void abc (Animal a){
        System.out.println("A");
    }
    void abc (Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Animal a = new Animal();
        Animal m = new Mouse();
        Mouse m2 = new Mouse();
        main.abc(m);
        main.abc(m2);
        m.getName();
        m2.getName();
        a.getName();
    }
}
