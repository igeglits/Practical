package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SynchronizedCollection {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        //arrayList<Integer> target = new arrayList<>();
        List<Integer> synchronizedTarget =
                Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () ->{
            synchronizedTarget.addAll(source);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronizedTarget.forEach(System.out::print);
    }
}
