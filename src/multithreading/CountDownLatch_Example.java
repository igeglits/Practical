package multithreading;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.CountDownLatch;

class CountDownLatch_Example {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown(); // уменьшаем счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("All is ready, so let's open market");
        countDownLatch.countDown();// уменьшаем счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();// уменьшаем счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) {
        new Friend("Sveta", countDownLatch).startThread();
        new Friend("Vlad", countDownLatch).startThread();
        new Friend("Igor", countDownLatch).startThread();
        new Friend("Arnold", countDownLatch).startThread();
        new Friend("Dutch", countDownLatch).startThread();

        try {
            marketStaffIsOnPlace();
            everythingIsReady();
            openMarket();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

@NoArgsConstructor
@AllArgsConstructor
class Friend extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public void startThread() {// метод запускает поток и вызывает метод run у объекта класса Person
        start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();// ждем пока countDownLatch не станет равен 0 (пока все потоки не вызовут метод countDown)
            System.out.println(name + " приступил(а) к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
