package lesson_16_multithreading.homework.coding;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

class NotThreadSafeIdGenerator {
    private int id;
    private boolean even;

    public int getNextId() {
        id++;
        this.even = isEven(id);
        return id;
    }
    public boolean isEven() {
        return this.even;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) throws InterruptedException {
        NotThreadSafeIdGenerator idGenerator = new NotThreadSafeIdGenerator();
        List<IdAndThread> list = new CopyOnWriteArrayList<>();
        CountDownLatch latch = new CountDownLatch(10);

        System.out.printf("|  %s   |   %s    |%n", "ID", "Thread Name");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add(new IdAndThread(idGenerator.getNextId(), Thread.currentThread().getName()));
                }
                latch.countDown();
            }).start();
        }
        latch.await();
        new NotThreadSafeIdGenerator().toFindRepeatedId(list);

    }

    protected void toFindRepeatedId(List<IdAndThread> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(i).id() == list.get(j).id()) {
                    System.out.printf("|  %d   | %s   |%n", list.get(i).id(), list.get(i).threadName());
                    System.out.printf("|  %d   | %s   |%n", list.get(j).id(), list.get(j).threadName());
                }
            }
        }
    }
}

record IdAndThread(int id, String threadName) {
}
