package waiting;

public class SimpleWaiting {
    public static void main(String[] args) throws InterruptedException {
        Thread main = new Thread(new MainThread());
        Thread second = new Thread(new SecondThread());
        Thread first = new Thread(new FirstThread());
        main.start();
        System.out.println("main thread started. its alive?" + main.isAlive());
        second.start();
        System.out.println("second thread started. its alive?" + second.isAlive());
        first.start();
        System.out.println("first thread started. its alive?" + first.isAlive());

        System.out.println("the end of threads!");
    }
}
