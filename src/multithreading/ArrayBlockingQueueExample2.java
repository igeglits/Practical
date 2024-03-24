package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);// создаем блокирующую очередь на 4 элемента

        //Producer
        new Thread (() ->{
            int i = 0;
            while(true){
                try {
                    queue.put(++i);
                    System.out.println("Producer added: " + i + " " + queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //Consumer
        new Thread(() ->{
            while(true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer took: " + j + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
