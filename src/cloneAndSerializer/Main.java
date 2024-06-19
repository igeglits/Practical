package cloneAndSerializer;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(32, "Alex");

        ByteArrayOutputStream savePerson = serializeObject(person);
        Person loadedPerson = (Person) deserializeObject(savePerson);

        System.out.println(person == loadedPerson);
        System.out.println(person.equals(loadedPerson));
    }

    public static ByteArrayOutputStream serializeObject(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
        }
        return baos;
    }

    public static Object deserializeObject(ByteArrayOutputStream baos) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try(ObjectInputStream ois = new ObjectInputStream(bais)) {
            return ois.readObject();
        }
    }

    static class Person implements Serializable{
        private String name;
        private int age;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
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
            return Objects.hash(name, age);
        }
    }
}
