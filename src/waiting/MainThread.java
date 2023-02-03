package waiting;

public class MainThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.currentThread().join(4000);
            System.out.println("main thread finished.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
