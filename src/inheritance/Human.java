package inheritance;

class Human {
    protected String name;//protected - доступен внутри пакета
      // и в наследниках класса Human
    static int salary = 150;

    public void work(){
        System.out.println("I am working");
    }
    public static void rest(){
        System.out.println("I am resting");
    }
}
class Student extends Human{
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        System.out.println("Name: "+student.name);
        student.work();
        rest();
        System.out.println("Salary: "+ salary);
    }
}
