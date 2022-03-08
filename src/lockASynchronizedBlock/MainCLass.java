package lockASynchronizedBlock;

public class MainCLass {
    public static void main(String[] args) {
    Display d= new Display();
     MyThread t1 = new MyThread(d,"Ratan");
     MyThread t2 = new MyThread(d,"sam");
     t1.start();
     t2.start();
    }
}
