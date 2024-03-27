package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class SynchronizedCollection2 {
    public static void main(String[] args) throws InterruptedException {
        //arrayList<Integer> arrayList = new arrayList<>();
        List<Integer> arrayList = Collections.synchronizedList(new ArrayList<>());// создаем синхронизированный
        // список из arrayList (arrayList -
        // это обычный список, который не синхронизирован)
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        Runnable runnable = () -> {
            synchronized (arrayList) { // synchronized block for arrayList object to avoid concurrent
                // modification exception in the next line of code (iterator.next())
                Iterator<Integer> iterator = arrayList.iterator(); // создаем итератор для списка arrayList
                // (в данном случае для синхронизированного списка) для последовательного перебора элементов списка
                while (iterator.hasNext()) {

                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> {
            arrayList.remove(10);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
        System.out.println(arrayList);
    }
}

