package displayObjects;
public class MyThread2 extends Thread{
    Display d ;
    MyThread2(Display d){
        this.d = d;
    }
    public void run(){
        d.displayC();
    }
}
