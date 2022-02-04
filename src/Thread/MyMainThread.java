package Thread;

public class MyMainThread {
    public static void main(String[] args) {
        RunnableThread r = new RunnableThread();
        Thread t = new Thread(r);   // r= target runnable
        t.start();
        for (int i=0;i<=1;i++){
            System.out.println("Main Thread");
        }










//        MyThreadArgument A= new MyThreadArgument();
//        A.start();
//        System.out.println("Main Thread");
        //      MyThread t= new MyThread();
        //        t.start();
        //      for(int i=0;i<=10;i++)  {
        //          System.out.println("Main Thread");
        //     }
    }
}
