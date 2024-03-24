package multithreading;

class DataRace_SynchronizedMethods {
    public static void main(String[] args) {
        MyRunnableImpl1 myRunnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
    public static synchronized void increment() {

//        synchronized(Counter.class) либо так, без записи метода synchronized в сигнатуре. Тогда мы помечаем только какой-то один метод, а не все.
        {
            Counter.count++;
            System.out.printf("%s: %d\n", Thread.currentThread().getName(), Counter.count);
        }
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImpl1 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            DataRace_SynchronizedMethods.increment();
        }
    }
}

