package synchronize;

public class Main {
    public static void main(String[] args) {
        Game[] t = {
                new Game(1520),
                new Game(2560),
                new Game(1580),
                new Game(4120)
        };

        Buyer c1 = new Buyer(1, t);
        Buyer c2 = new Buyer(2, t);
        Buyer c3 = new Buyer(3, t);
        Buyer c4 = new Buyer(4, t);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
