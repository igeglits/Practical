package override;

class Animal2 {
    String showName() {
        return "Animal";
    }

    void showInfo() {
        System.out.println("Name Animal: " + showName());
    }
}

class Mouse2 extends Animal2 {
    @Override
    String showName() {
        return "Mouse";
    }

    public static void main(String[] args) {
        Animal2 a = new Mouse2();
        Mouse2 m = new Mouse2();
        Animal2 m2 = new Animal2();
        a.showInfo();
        m.showInfo();
        m2.showInfo();
    }
}

class Animal3 {
    static String showName() {
        return "Animal3";
    }

    void showInfoAnimal() {
        System.out.println("Name Animal3 " + showName());
    }
}

class Mouse3 extends Animal3 {
    static String showName() {
        return "Mouse3";
    }

    void showInfoMouse() {
        System.out.println("Name of mouse3 " + showName());
    }

    public static void main(String[] args) {

        Mouse3 m = new Mouse3();
        m.showInfoMouse();
        m.showInfoAnimal();
    }
}