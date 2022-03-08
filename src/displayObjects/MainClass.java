package displayObjects;

public class MainClass {
    public static void main(String[] args) {
        Display display = new Display();
//        Display display1 = new Display();
        MyThread1 t1 = new MyThread1(display);
        MyThread2 t2 = new MyThread2(display);
        t1.start();
        t2.start();
    }
}
