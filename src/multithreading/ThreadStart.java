package multithreading;

class ThreadStart {
    public static void main(String[] args) {
        MyTread1 myTread1 = new MyTread1();
        MyTread2 myTread2 = new MyTread2();
        myTread1.start();
        myTread2.start();

    }
}
class MyTread1 extends Thread{
    public void run(){
        for(int i=0; i<=1000; i++){
            System.out.println(i);
        }
    }
}
class MyTread2 extends Thread{
    public void run(){
        for(int i=1000; i>=0; i--){
            System.out.println(i);
        }
    }
}