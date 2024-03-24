package multithreading;

class  MethodJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        Thread myThread = new Thread(new Worker());
        myThread.start();
        myThread.join(1500);//подождать пока закончится поток myThread 1.5 секунды, иначе свое выполнение
        //здесь myThread работает 2.5 секунды, а main 1.5 секунды, значит Main закончится раньше чем myThread
        System.out.println("Main ended");
    }
}
class Worker implements Runnable{
    @Override
    public void run(){
        System.out.println("Work started");
        try{
            Thread.sleep(2500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Work finished");
    }
}
