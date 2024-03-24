

class Employee2 {
    public int id;
    public String name;
    public int age;
    public int salary;
    public String department;

    Employee2(int id, String name, int age) {
        this(name, age);//вызов конструктора ниже
        this.id = id;
    }

    Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Employee2(int id, String name, int age, int salary, String department) {
        this(id, name, age);//вызов первого конструктора
        this.salary = salary;
        this.department = department;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee2 emp = new Employee2(1, "Ivanov", 25);
        System.out.println(emp.id);
        Employee2 emp1 = new Employee2("Sidorov", 20);
        Employee2 emp2 = new Employee2(12, "Petrov", 30, 1000, "QA");
        System.out.println(emp2.department);
    }
}
class Employee3 {
    public int id;
    public String name;
    public int age;
    public int salary;
    public String department;

    Employee3(int id, String name, int age) {
        this(id, name, age, 0,null);
    }

    Employee3(String name, int age) {
        this(0, name,age,0, null);
    }

    Employee3(int id, String name, int age, int salary, String department) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary = salary;
        this.department = department;
    }
}