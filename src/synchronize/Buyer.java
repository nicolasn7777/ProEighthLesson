package synchronize;

public class Buyer extends Thread {
    int id;
    Game[] t;

    Buyer(int id, Game[] t) {
        this.id = id;
        this.t = t;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < t.length; i++) {
            t[i].buy(this);
        }
    }
}
