package priority;

public class Main extends Thread{
    public static void main(String[] args) {
        Thread min = new Thread(new PriorityThread());
        Thread norm = new Thread(new PriorityRunner());
        Main max = new Main();
        min.start();
        norm.start();
        max.start();

    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(MAX_PRIORITY);
        for (int i = 1; i <= 50; i++) {
            System.out.println("MAX_PRIORITY counting by " + Thread.currentThread().getName() + " = " + i);
        }
    }
}
