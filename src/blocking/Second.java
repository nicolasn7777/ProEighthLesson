package blocking;

public class Second extends Thread {
    private Thread t2;

    Second() {
        System.out.println("Second create");
    }

    public void setThread1(Thread t) {
        this.t2 = t;
    }

    @Override
    public void run() {
        System.out.println("Second start");

        System.out.println("Second interrupt First finish…");

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second finished");
    }
}
