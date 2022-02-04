package Thread;

public class MyThreadArgument extends Thread{
    public void start(){ //only  output produced by main thread(not recommended)


//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("no-arg");
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    public void run(){// output produced by second thread(highly recommended)
        System.out.println("int-arg");
    }
}
