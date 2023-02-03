package unblocking;

public class First extends Thread{

    private Thread t1;

    First() {
        System.out.println("First create");
    }

    public void setThread2(Thread t) {
        this.t1 = t;
    }

    @Override
    public void run() {
        System.out.println("First start");

        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("First interrupt Second finish…");

//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("First finished");
    }
}
