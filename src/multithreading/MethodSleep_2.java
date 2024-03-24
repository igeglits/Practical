package multithreading;

class MethodSleep_2 extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try { //метод РАН не выбрасывает exception потому что у него в сигнатуре оригинального метода run() нет throws InterruptedException
                //значит мы должны обрабатывать исключение внутри метода, обернуть. В данном случае обернули в try-catch
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try { //метод РАН не выбрасывает exception потому что у него в сигнатуре оригинального метода run() нет throws InterruptedException
                //значит мы должны обрабатывать исключение внутри метода, обернуть. В данном случае обернули в try-catch
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable1());
        myThread.start();
        MethodSleep_2 myThread2 = new MethodSleep_2();
        myThread2.start();
        myThread.join();//метод join() заставляет ждать завершения потока, в котором он вызван
        myThread2.join();//вызваны потоки в методе main, поэтому main ждет их завершения
        System.out.println("end of main");
    }
}
