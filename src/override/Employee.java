package override;

class Employee {

    double salary;
    String name;
    int age;
    int experience;

    SchoolSubject teach() {
        return new SchoolSubject();
    }

    void eat() {
        System.out.println("Employee is eating");
    }

    void sleep() {
        System.out.println("Employee is sleeping");
    }
}

class Teacher extends Employee {

    @Override
    void eat() {
        System.out.println("Teacher is eating");
    }

    String subject;

    @Override
    Math teach() {// переписанный метод, возвращает субкласс от класса SchoolSubject в суперклассе Employee
        return new Math();
    }
}

class SchoolSubject {

}

class Math extends SchoolSubject {

}