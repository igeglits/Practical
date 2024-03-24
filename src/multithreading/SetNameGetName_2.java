package multithreading;

class SetNameGetName_2 {
    public static void main(String[] args) {
        MyThread7 myThread7 = new MyThread7();
        myThread7.setName("MyThread7");
        myThread7.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread7: " + myThread7.getName() + "\n" + "Priority of myThread7: " + myThread7.getPriority());

    }
}

class MyThread7 extends Thread {
    public void run() {
        System.out.println("MyThread5 is running...");
    }
}
