package Thread;

public class MainJoinThread {
    public static void main(String[] args) throws InterruptedException {
//        MyThread t = new MyThread();
//        Thread.currentThread().setPriority(4);
//        t.setPriority(10);
//        t.start();
        Thread.currentThread().join(3000);
        for(int i=0;i<=10;i++)  {
            System.out.println("Main Thread");
        }
    }
}
