
class Mythread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("thread is started");
    }
}
public class Threaddemo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();   
    }
}   