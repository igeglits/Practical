package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main2{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(6.1, "Olga"));
        list.add(new Student(5.5, "Maksim"));
        list.add(new Student(6.8, "Artem"));

        for (Student student : list) {
            System.out.println(student.name);
        }
    }

    static class Student implements Comparable<Student> {
        private final double progress;
        private final String name;

        public Student(double progress, String name) {
            this.progress = progress;
            this.name = name;
        }

        @Override
        public int compareTo(Student student) {

        }
    }
}
