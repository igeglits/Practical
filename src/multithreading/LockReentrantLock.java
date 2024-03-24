package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockReentrantLock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(call::mobileCall); //эквивалентно лямбда-выражению () -> call.mobileCall()
        Thread thread2 = new Thread(() -> call.skypeCall());
        Thread thread3 = new Thread(() -> call.whatsappCall());
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Call {
    private Lock lock = new ReentrantLock();// это объект, который можно использовать для синхронизации потоков
    //ReentrantLock - это класс, который реализует интерфейс Lock
    //ReentrantLock - это объект, который можно использовать для синхронизации потоков
    //фактически эта конструкция выполняет ту же функцию, что и synchronized

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {  //finally блок выполняется всегда, даже если в try блоке произошло исключение и произойдет unlock
            lock.unlock();
        }
    }
    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {  //finally блок выполняется всегда, даже если в try блоке произошло исключение и произойдет unlock
            lock.unlock();
        }
    }
    void whatsappCall() {
        lock.lock();
        try {
            System.out.println("Whatsapp call starts");
            Thread.sleep(5000);
            System.out.println("Whatsapp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {  //finally блок выполняется всегда, даже если в try блоке произошло исключение и произойдет unlock
            lock.unlock();
        }
    }
}
