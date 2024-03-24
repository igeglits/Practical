package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorServiceEx {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
       /* for (int i = 0; i < 10; i++) {
            scheduledExecutorService.execute(new RunnableImpl13());

        }*/
        /*scheduledExecutorService.schedule(new RunnableImpl13(), 3, TimeUnit.SECONDS); // запускает поток через 3 секунды и завершает работу
        scheduledExecutorService.shutdown();*/

        /*scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl13(), 3, 1, TimeUnit.SECONDS); // запускает поток через 3 секунды и потом каждую секунду
        Thread.sleep(20000);// ждем 20 секунд и останавливаем пул потоков
        scheduledExecutorService.shutdown();*/

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl13(), 3, 1, TimeUnit.SECONDS); // запускает поток через 3 секунды
         // и потом каждую секунду после завершения работы потока (после окончания работы потока)
        Thread.sleep(20000);// ждем 20 секунд и останавливаем пул потоков
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();// создаем пул потоков с неограниченным количеством потоков в пуле
        // (количество потоков зависит от количества задач)

    }
}

class RunnableImpl13 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
