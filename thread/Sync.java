class Pizza {
    synchronized void orderPizza() {
        System.out.println(Thread.currentThread().getName() + " ordered pizza");
    }
}
class MyThread extends Thread {
    Pizza p;
    MyThread(Pizza p) {
        this.p = p;
    }
    public void run() {
        p.orderPizza();
    }
}
public class Sync {
    public static void main(String[] args) {
        System.out.println("order pizza");
        Pizza p = new Pizza();
        MyThread t1 = new MyThread(p);
        MyThread t2 = new MyThread(p);
        t1.start();
        t2.start();
    }
}