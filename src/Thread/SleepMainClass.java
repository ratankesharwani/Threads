package Thread;

public class SleepMainClass {
    public static void main(String[] args) {
        SleepClass S= new SleepClass();
        S.start();
        S.interrupt();
        System.out.println("End Of Main");
    }
}
