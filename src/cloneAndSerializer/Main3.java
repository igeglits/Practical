package cloneAndSerializer;

import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();

        ByteArrayOutputStream saveSingleton = serializeObject(singleton);
        Singleton loadedSingleton = (Singleton) deserializeObject(saveSingleton);

        System.out.println(singleton == loadedSingleton);
        System.out.println(singleton.equals(loadedSingleton));
    }

    public static ByteArrayOutputStream serializeObject(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
        }
        return baos;
    }

    public static Object deserializeObject(ByteArrayOutputStream baos) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            return ois.readObject();
        }
    }

    static class Singleton implements Serializable {
        private static final Singleton instance = new Singleton();

        private Singleton() {
        }

        public static Singleton getInstance() {
            return instance;
        }

        private Object readResolve() {
            return instance;
        }
    }
}
