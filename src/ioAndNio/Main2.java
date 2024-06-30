package ioAndNio;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        byte[] array = new byte[]{1, 2, 3, 4, 5};

        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        bais.close();

        int data;
        while ((data = bais.read()) != -1) {
            System.out.print(data + " ");

        }
    }
}
       /* В ByteArrayInputStream, вызов close() не закрывает поток в обычном смысле.
Он фактически не изменяет состояние потока, поэтому после вызова close() поток
сё ещё может быть использован для чтения данных. Это поведение характерно для Java
и связано с тем, что ByteArrayInputStream работает в памяти и не использует внешние
        ресурсы, требующие явного освобождения.*/