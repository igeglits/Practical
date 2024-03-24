package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);// создаем блокирующую очередь на 4 элемента
        // (в отличие от обычной очереди, которая не блокирует потоки)
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5); // добавляем элемент в очередь, но если места нет, то возвращается false
        // (в отличие от add, которая выбросит исключение)
        System.out.println(queue);
    }
}
