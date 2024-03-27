package lesson_16_multithreading.homework.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

class RandomNumberList {
    private List<Integer>  randomNumbers = Collections.synchronizedList(new ArrayList<>());
/*T - это тип элементов в списке.
new arrayList<>() - создает новый экземпляр списка (в данном случае arrayList),
который будет обернут в синхронизированный список.
После этой строки кода synchronizedList будет синхронизированным списком,
который можно использовать в многопоточной среде безопасно.*/
    public void add(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public int size() {
        return this.randomNumbers.size();
    }

    public static void main(String[] args) {
        RandomNumberList randomNumberList = new RandomNumberList();
        CountDownLatch latch = new CountDownLatch(3);
        for (int i=1; i<=3; i++){
            new Thread(() -> {
                for (int j=1; j<=1000; j++){
                    randomNumberList.add((int) (Math.random() * 1000));

                }
                latch.countDown();
            }).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(randomNumberList.size());

    }


}



