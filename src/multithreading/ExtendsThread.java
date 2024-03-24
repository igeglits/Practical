package multithreading;

class ExtendsThread extends Thread{

    public void run(){
        for(int i=0; i<=1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ExtendsThread myTread1 = new ExtendsThread();
        myTread1.start();

        for(int i=1000; i>=0; i--){
            System.out.println(i);
        }
    }
}
