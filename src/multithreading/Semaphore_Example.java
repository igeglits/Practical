package multithreading;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.Semaphore;

class Semaphore_Example {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Igor", callBox).startThread();
        new Person("Eglit", callBox).startThread();
        new Person("Vlad", callBox).startThread();
        new Person("Ivan", callBox).startThread();
        new Person("Petr", callBox).startThread();

    }
}

@NoArgsConstructor
@AllArgsConstructor
class Person extends Thread {
    String name;
    private Semaphore callBox;

    public void startThread() {// метод запускает поток и вызывает метод run у объекта класса Person
        start();
    }

    ;

    @Override
    public void run() {

        try {
            System.out.println(name + " wait....");
            callBox.acquire();//acquire заблокирует поток и выдаст разрешение когда будет свободен ресурс
            System.out.println(name + " uses the callBox");
            sleep(2000);
            System.out.println(name + "  ends call");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();// release освободит ресурс и разблокирует поток который ждет своей очереди на использование ресурса callBox
        }
    }
}