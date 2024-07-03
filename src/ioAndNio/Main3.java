package ioAndNio;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        // Создание объекта MyObject
        MyObject myObject = new MyObject("Zone", 51);

        // Поток для записи объекта в байты
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Сериализация объекта
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(myObject); // Запись объекта в поток
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Получаем байты, представляющие сериализованный объект
        byte[] serializedObjectBytes = baos.toByteArray();

        // Поток для чтения байтов (десериализация)
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedObjectBytes);
             ObjectInputStream ois = new ObjectInputStream(bais)) {

            // Десериализация объекта
            MyObject deserializedObject = (MyObject) ois.readObject();

            // Вывод параметров десериализованного объекта
            System.out.println(deserializedObject.type + " " + deserializedObject.size);
            // На экран должно быть выведено: Zone 51

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Добавьте реализацию интерфейса Serializable
    static class MyObject implements Serializable {
        private static final long serialVersionUID = 1L; // Рекомендуется для Serializable
        String type;
        int size;

        public MyObject(String type, int size) {
            this.type = type;
            this.size = size;
        }
    }
}
