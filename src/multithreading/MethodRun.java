package multithreading;

class MethodRun implements Runnable {
    public void run() {
        System.out.println("Method run. Thread name = "
                + Thread.currentThread().getName()); //показывает текущий поток
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MethodRun());
        myThread.start();
        System.out.println("Method main. Thread name = "
                + Thread.currentThread().getName());
    }
}
