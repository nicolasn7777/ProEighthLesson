package waiting;

public class FirstThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.currentThread().join(2000);
            System.out.println("first thread finished.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
