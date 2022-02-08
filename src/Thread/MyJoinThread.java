package Thread;

public class MyJoinThread extends Thread{
    static Thread mt2;
    public Thread mt;
    public void run(){
        try {
            mt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<=10;i++){

            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
