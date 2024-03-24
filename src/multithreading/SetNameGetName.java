package multithreading;

class SetNameGetName {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println("Name of myThread5: " + myThread5.getName() + "\n" + "Priority of myThread5: " + myThread5.getPriority());
        MyThread5 myThread6 = new MyThread5();
        System.out.println("Name of myThread6: " + myThread6.getName() + "\n" + "Priority of myThread6: " + myThread6.getPriority());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("MyThread5 is running...");
    }
}
