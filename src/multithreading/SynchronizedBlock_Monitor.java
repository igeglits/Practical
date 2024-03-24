package multithreading;

class SynchronizedBlock_Monitor {
    public static void main(String[] args) {
        MyRunnableImpl2 myRunnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }

    public void increment() {

        synchronized (this) {//this - это объект, на котором вызывается метод increment(), этот монитор мы синхронизируем, открываем и закрываем для потоков
            Counter2.count++;
            System.out.printf("%s: %d\n", Thread.currentThread().getName(), Counter2.count);
        }
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImpl2 implements Runnable {
    SynchronizedBlock_Monitor synchronizedBlock_monitor = new SynchronizedBlock_Monitor();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronizedBlock_monitor.increment();
        }
    }
}
