package multithreading;

class DaemonThread {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        User_Thread user_thread = new User_Thread();
        user_thread.setName("User thread");
        Daemon_Thread daemon_thread = new Daemon_Thread();
        daemon_thread.setName("Daemon thread");
        daemon_thread.setDaemon(true); // setDaemon(true) - установка потока в режим демона обязательно сделать до запуска потока
        user_thread.start();
        daemon_thread.start();
    }
// потоки демоны завершаются автоматически, когда завершается последний поток-не демон
// потоки демоны не могут быть использованы для решения задач, которые требуют сохранения данных

}

class User_Thread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " isDaemon = " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Daemon_Thread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " isDaemon = " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}