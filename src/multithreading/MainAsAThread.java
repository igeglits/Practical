package multithreading;

public class MainAsAThread implements Runnable{
    public void run(){
        for(int i=0; i<=1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MainAsAThread());
        thread1.start();
        for(int i=1000; i>=0; i--){
            System.out.println(i);
        }
        //здесь main сам по себе поток, и он выполняется параллельно с потоком thread1

    }
}
