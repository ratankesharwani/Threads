package Thread;

public class YieldThreadClass extends Thread{
    public void run( ){
        for(int i=0;i<=10;i++)  {
            System.out.println("Child Thread");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
