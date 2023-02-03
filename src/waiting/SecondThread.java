package waiting;

public class SecondThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.currentThread().join(3000);
            System.out.println("second thread finished.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
