package synochrinized;

public class MainClass {
    public static void main(String[] args) {
       Display display = new Display();             //     synchronization not required.......
        Display display1 = new Display();               //  synchronization not required.......
        Display display2 = new Display();
        MyThread t0 = new MyThread(display,"ARmana");    //  synchronization not required.......
       MyThread t1 = new MyThread(display1, "Ratan");    //   synchronization not required.......
//        MyThread t2 = new MyThread(display2, "Sam");
//        MyThread t3 = new MyThread(display2,"lion");
//        t2.start();
//        t3.start();
        t0.start();
        t1.start();
    }
}
