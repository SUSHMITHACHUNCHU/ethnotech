class MessageSender extends java.lang.Thread {

    public MessageSender(String name) {
        super(name);
    }

    @Override 
    public void run() {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(getName() + " is sending message");
                java.lang.Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            System.out.println("Thread interrupted: " + e);
        }
    }
}

public class MessageApp {

    public static void main(String[] args) throws InterruptedException
{

        MessageSender t1 = new MessageSender("User1");
        MessageSender t2 = new MessageSender("User2");
        //set priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //state of the thread
        System.out.println("State of t1 before start: " + t1.getState());
        t1.start();
        t2.start();
        // main thread waits 
        t1.join(); 
        t2.join();
        System.out.println("message sent"+t1.isAlive()+" "+t1.getState());
        System.out.println("sender is interrupted: " + t1.isInterrupted());

    }
} 
//asynchronized - each thread runs independently and does not wait for the other to finish.
//synchronized - one thread waits for the other to finish before it can start.