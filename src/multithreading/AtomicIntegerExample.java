package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicIntegerExample {
   // static int counter = 0;
    static AtomicInteger counter = new AtomicInteger();
    public static void incrementCounter(){
        //counter++;
        counter.incrementAndGet();// увеличивает значение на 1 и возвращает его
        //counter.getAndIncrement(); // возвращает значение и увеличивает его на 1
        //counter.decrementAndGet(); // уменьшает значение на 1 и возвращает его
        //counter.getAndDecrement(); // возвращает значение и уменьшает его на 1
        //counter.getAndAdd(5); // возвращает значение и увеличивает его на 5 (или уменьшает на 5, если аргумент отрицательный)
        //counter.addAndGet(5); // увеличивает значение на 5 и возвращает его (или уменьшает на 5, если аргумент отрицательный)

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable14());
        Thread thread2 = new Thread(new MyRunnable14());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
class MyRunnable14 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.incrementCounter();
        }
    }
}