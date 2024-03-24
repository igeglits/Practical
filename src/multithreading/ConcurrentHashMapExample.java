package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.sleep;

class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(); // создаем мапу, которая является потокобезопасной (в отличие от HashMap)
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();// получаем итератор для мапы ключей и запускаем цикл
            while (iterator.hasNext()) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };
        Runnable runnable2 = () -> {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "six"); // добавляем новый элемент в мапу во время итерации по ней в другом потоке (в потоке runnable) -
            // это возможно благодаря ConcurrentHashMap (в отличие от HashMap) -
            // итератор не выбрасывает ConcurrentModificationException при изменении мапы в другом потоке во время итерации по ней
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);

    }
}

