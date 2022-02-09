package Thread;

public class SleepClass extends Thread {
    public void run() {


        try {
            for (int i = 0; i <= 10000; i++) {
                System.out.println("I am lazy");

                Thread.currentThread().sleep(2000);}

            } catch(InterruptedException e){
                System.out.println("I got Interrupted");
            }
        }
    }

