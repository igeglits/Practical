package multithreading;

class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();//прерывание потока из другого потока, здесь из main. Но это невозможно без блока проверки в прерываемом блоке кода
        interruptedThread.join();
        System.out.println("Main thread finished");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if(isInterrupted()){
                System.out.println("Поток прерван");
                System.out.println(sqrtSum);
                return;//завершение потока
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("поток хотят прервать во время сна");
                System.out.println(sqrtSum);
                return;//завершение потока
            }
        }
        System.out.println(sqrtSum);
    }
}
