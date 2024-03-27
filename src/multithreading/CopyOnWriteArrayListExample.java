package multithreading;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();// создаем список, который является потокобезопасным (в отличие от arrayList)
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Initial list: " + list);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1: " + iterator.next());
            }
        };
        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(4);// удаляем элемент из списка во время итерации по нему в другом потоке (в потоке runnable1)
            // - это возможно благодаря CopyOnWriteArrayList
            // - итератор не выбрасывает ConcurrentModificationException при изменении списка в другом потоке во время итерации по нему
            list.add("F");//
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final list: " + list);
    }
}
