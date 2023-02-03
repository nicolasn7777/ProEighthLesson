package priority;

import static java.lang.Thread.NORM_PRIORITY;

public class PriorityRunner implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setPriority(NORM_PRIORITY);

        for (int i = 1; i <= 50; i++) {
            System.out.println("NORM_PRIORITY counting by " + Thread.currentThread().getName() + " = " + i);
        }
    }
}
