package unblocking;

public class Main {
    public static void main(String[] args) {
        First t1 = new First();
        Second t2 = new Second();

        t1.setThread2(t2);
        t2.setThread1(t1);

        t1.start();
        t2.start();
    }
}
