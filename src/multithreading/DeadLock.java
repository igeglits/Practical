package multithreading;

class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();

    }

}
//здесь может быть ситуация когда поток первый захватывает первый лок, второй захватывает второй лок, и они ждут друг друга
//потому что каждый хочет захватить лок, который уже захвачен другим потоком
//это называется deadlock
//чтобы избежать deadlock, нужно захватывать локи в одном и том же порядке
//или использовать методы tryLock() и unlock()
//или использовать методы wait() и notify()
//или использовать методы join() и isAlive()
//или использовать методы sleep() и interrupt()
//или использовать методы yield() и isAlive()
//или использовать методы yield() и join()
//или использовать методы sleep() и join()
//или использовать методы sleep() и isAlive()
//или использовать методы yield() и interrupt()
//или использовать методы wait() и isAlive()
class Thread10 extends Thread {

    public void run() {
        System.out.println("Thread10: Попытка захватить lock1");
        synchronized (DeadLock.lock1) {
            System.out.println("Thread10: lock1 захвачен");
            System.out.println("Thread10: Попытка захватить lock2");
            synchronized (DeadLock.lock2) {
                System.out.println("Thread10: lock1 и lock2 захвачен");
            }
        }
    }
}
class Thread20 extends Thread {

    public void run() {
        System.out.println("Thread20: Попытка захватить lock2");
        synchronized (DeadLock.lock2) {
            System.out.println("Thread20: lock2 захвачен");
            System.out.println("Thread20: Попытка захватить lock1");
            synchronized (DeadLock.lock1) {
                System.out.println("Thread20: lock 1 и lock2 захвачены");
            }
        }
    }
}
