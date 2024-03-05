package lesson_16_multithreading.homework.coding;

class Level_1 {
    private static int threadNumber = 1;

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello World " + threadNumber++);
        }).start();
        new Thread(() -> {
            System.out.println("Hello World " + threadNumber++);
        }).start();
        new Thread(() -> {
            System.out.println("Hello World " + threadNumber++);
        }).start();
        new Thread(() -> {
            System.out.println("Hello World " + threadNumber++);
        }).start();
        new Thread(() -> {
            System.out.println("Hello World " + threadNumber++);
        }).start();

    }
}
