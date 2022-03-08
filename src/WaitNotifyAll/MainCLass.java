package WaitNotifyAll;

public class MainCLass {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

            synchronized (t){
                Thread.sleep(100);

                t.wait(0,0);
//            System.out.println("over");
        }
        System.out.println(t.total);
    }
}
