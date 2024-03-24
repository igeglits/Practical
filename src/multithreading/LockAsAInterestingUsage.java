package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockAsAInterestingUsage {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("A", lock);
        new Employee("B", lock);
        new Employee("C", lock);
        Thread.sleep(5000);
        new Employee("D", lock);
        new Employee("E", lock);
    }
}
class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();// запускаем поток сразу после создания, а не в main методе
    }
    //первый вариант
    /*public void run(){
        System.out.println(name + " is waiting for the lock");
        lock.lock();
        System.out.println(name + " has acquired the lock");
        try {
            Thread.sleep(2000);
            System.out.println(name + " has released the lock");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }*/
//второй вариант с использованием tryLock
    public void run(){
        if(lock.tryLock()){
            System.out.println(name + " has acquired the lock");
            try {
                Thread.sleep(2000);
                System.out.println(name + " has released the lock");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }

        }
        else {
            System.out.println(name + " did not want to wait for the lock and left the office");
            //если не удалось захватить lock, то поток уходит из метода run и может выполнить другую работу
        }
    }

}
