package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadPool_ExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);// создаем пул из 5 потоков не с помощью конструктора, а с помощью метода фактори метода newFixedThreadPool.
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl12()); // метод execute запускает потоки в пуле

        }
        executorService.shutdown(); // метод shutdown завершает работу потоков в пуле
        executorService.awaitTermination(5, TimeUnit.SECONDS); // метод awaitTermination ждет завершения работы потоков в пуле в течении 5 секунд. Работает как join
        System.out.println("Main thread finished");
    }
}

class RunnableImpl12 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" begins work");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" ends work");
    }

}
