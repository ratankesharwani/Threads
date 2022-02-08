package Thread;
public class MyMainThread {
    public static void main(String[] args) throws InterruptedException {
//        MyJoinThread.mt = Thread.currentThread();
        MyJoinThread t = new MyJoinThread();
        t.mt=Thread.currentThread();
        t.start();
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
//       MyThreadArgument A= new MyThreadArgument();
//        A.start();
//        System.out.println("Main Thread");
//        MyThread t= new MyThread();
//        currentThread().setPriority(5);
//        t.setPriority(10);
//              t.start();
//              for(int i=0;i<=10;i++)  {
//                  System.out.println("Main Thread");
//             }
//        System.out.println(t.getName());
//        System.out.println(currentThread().getName());
//        System.out.println(t.getPriority());
////        System.out.println(currentThread().getPriority());
//        currentThread().setPriority(1);
//        YieldThreadClass t = new YieldThreadClass();
//        t.setPriority(7);
//        t.start();
//        t.join();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Main Thread");
//        }

    }
}
