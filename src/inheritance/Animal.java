package inheritance;

class Animal {

    Animal() {
        System.out.println("I am Animal");
    }

    int eyes;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void drink() {
        System.out.println("Animal is drinking");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I am Pet");
        eyes = 2;
    }

    private final int tale = 1;
    private final int paw = 4;

    public int getEyes() {
        return eyes;
    }

    public int getTale() {
        return tale;
    }

    public int getPaw() {
        return paw;
    }

    public void run() {
        System.out.println("Pet is running");
    }
    public void jump() {
        System.out.println("Pet is jumping");
    }
}
class Dog extends Pet {
    private String name;

    Dog(String name) {
        System.out.println("I am Dog, my name is " + name);
    }
    public void play() {
        System.out.println("Dog is playing");
    }
}
class Cat extends Pet {
    private String name;

    Cat(String name) {
        System.out.println("I am Cat, my name is " + name);
    }
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
class Test{
    public static void main(String[] args) {
        Dog dog= new Dog("Rex");
        System.out.println(dog.getPaw());
        Cat cat= new Cat("Tom");
        cat.sleep();
    }
}
