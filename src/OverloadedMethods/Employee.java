package OverloadedMethods;

class Employee {
    private int ID;
    public String name;
    private int age;
    public int salary;
    private String department;

    Employee(int id, String name, int age, int salary, String department) {
        ID = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int salary2xUp(int salary) {
        return salary * 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(122, "Ivan", 45, 3400, "BackEnd");
        Employee employee2 = new Employee(236, "Igor", 46, 3500, "FrontEnd");

        System.out.println(employee1.salary2xUp(employee1.salary) + " " + employee1.name);
        System.out.println(employee2.salary2xUp(employee2.salary) + " " + employee2.name);
    }
}


