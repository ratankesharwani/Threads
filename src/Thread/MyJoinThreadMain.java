package Thread;

public class MyJoinThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MyJoinThread.mt2=Thread.currentThread();
        MyJoinThread t = new MyJoinThread();
        t.start();
//         t.join();  deadlock situation
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
