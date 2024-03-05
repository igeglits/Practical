package lesson_16_multithreading.homework.coding;

class Task1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 1");
            }
        }).start();
    }
}
