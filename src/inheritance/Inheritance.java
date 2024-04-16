package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name="John";
        doc.age=30;
        doc.experience=10;
        doc.specialization="Heart";
        doc.eat();
        doc.sleep();
        doc.treatPatient();
    }
}

class Employee {
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("inheritance.Employee is eating");
    }
    void sleep() {
        System.out.println("inheritance.Employee is sleeping");
    }
}

class Doctor extends Employee {
    String specialization;
    void treatPatient() {
        System.out.println("inheritance.Doctor is treating patient");
    }
}

class Teacher extends Employee{
    String subject;
    void teach() {
        System.out.println("inheritance.Teacher is teaching");
    }
}

class Driver   extends Employee{
    String route;
    void drive() {
        System.out.println("inheritance.Driver is driving");
    }
}
class Stomatolog extends Doctor{
    String specialization;
    void treatPatient() {
        System.out.println("inheritance.Stomatolog is treating patient");
    }
}
class Practicant extends Stomatolog{
    String specialization;
    void treatPatient() {
        System.out.println("inheritance.Practicant is treating patient");
    }
}
