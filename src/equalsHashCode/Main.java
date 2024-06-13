package equalsHashCode;

import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        Person dmitriy = new Person(20, "Dmitriy", 60);
        Person falseDmitriy = new Person(20, "Dmitriy", 50);
        System.out.println(dmitriy.equals(falseDmitriy));
    }

    static class Person {
        private final int age;
        private final String name;
        private final int weight;

        public Person(int age, String name, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name, weight);
        }
    }
}