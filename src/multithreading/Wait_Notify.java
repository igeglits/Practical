package multithreading;

class Wait_Notify {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
//потоки синхронизированы по объекту Маркет

class Market {
    private int breadCount = 0;
//private Object lock = new Object(); для случая синхронизации по объекту lock
    public synchronized void getBread() {//public void getBread() {
        while (breadCount < 1) {           //synchronized (lock) {
            try {
                wait();                     //lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Количество хлеба на складе: " + breadCount);
        notify();// то же самое, что и this.notify();
            //lock.notify();
    }

    public synchronized void putBread() {   //public void putBread() {
        while (breadCount >= 5) {
            try {
                wait(1000);                     //lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Производитель добавил на склад 1 хлеб");
        System.out.println("Количество хлеба на складе: " + breadCount);
        notify();
        //lock.notify();
    }
}

class Producer implements Runnable {
    Market market;

    Producer(Market market) {
        this.market = market;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            market.getBread();
        }
    }
}