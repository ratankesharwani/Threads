package Thread;

public class MainJoinThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("deadlock situation ........");
        Thread.currentThread().join();
    }
}
