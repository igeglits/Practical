package cloneAndSerializer;

import java.io.*;
import java.util.Objects;

public class Main2{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "temp";
        Person person = new Person(32, "Alex", 12345);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Person loadedPerson = (Person) ois.readObject();
            System.out.println(person == loadedPerson); // проверка ссылок
            System.out.println(person.equals(loadedPerson)); // проверка равности объектов
        }
    }

    static class Person extends Human{
        private String name;
        private int age;

        public Person(int age, String name, int dnk) {
            super(dnk);
            this.age = age;
            this.name = name;
        }

        private void writeObject(ObjectOutputStream o) throws NotSerializableException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream o) throws NotSerializableException {
            throw new NotSerializableException();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && name.equals(person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    static class Human implements Serializable {
        private int dnk;

        public Human(int dnk) {
            this.dnk = dnk;
        }
    }
}