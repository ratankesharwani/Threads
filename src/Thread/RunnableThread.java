package Thread;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());

        for (int i=0;i<=5;i++){
             System.out.println("Runnable Thread");
             Thread.currentThread().setName("child");
             System.out.println(Thread.currentThread().getName());
         }
    }
}
