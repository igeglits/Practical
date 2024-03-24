package ConstructorEqualsHashCode;

import java.util.Objects;

public class Student {
    private int studentID;
    private String name;
    private String family;
    private int year;
    private int averageMathMark;
    private int averageEconomicMark;
    private int foreignLangAverageMark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && year == student.year && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, name, year);
    }

    public Student(int studentID, String name, int year) {
        this.studentID = studentID;
        this.name = name;
        this.year = year;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
