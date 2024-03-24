package multithreading;

class LambdaForThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 1");
            }
        }).start();
        // или
        new Thread(() -> System.out.println("Hello from thread 2")).start();
    }
}
