package priority;

public class PriorityThread extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setPriority(MIN_PRIORITY);
        for (int i = 1; i <= 50; i++) {
            System.out.println("MIN_PRIORITY counting by " + Thread.currentThread().getName() + " = " + i);
        }
    }
}
