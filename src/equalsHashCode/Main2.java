package equalsHashCode;

import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        // Используем HashSet
        /*Set<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(6.1, "Olga"));
        hashSet.add(new Student(5.5, "Maksim"));
        hashSet.add(new Student(6.8, "Artem"));
        hashSet.add(new Student(6.1, "Olga")); // Этот студент не будет добавлен

        System.out.println("HashSet (неотсортированный):");
        for (Student student : hashSet) {
            System.out.println(student.name);
        }*/

        // Используем TreeSet
        Set<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student(6.1, "Olga"));
        treeSet.add(new Student(5.5, "Maksim"));
        treeSet.add(new Student(6.8, "Artem"));
        treeSet.add(new Student(6.1, "Olga")); // Этот студент не будет добавлен

        //System.out.println("\nTreeSet (отсортированный):");
        for (Student student : treeSet) {
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
            // Сравнение по успеваемости в обратном порядке
            return Double.compare(student.progress, this.progress);
        }
    }
}

