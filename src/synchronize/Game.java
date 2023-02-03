package synchronize;

public class Game {
    boolean isBought;
    int price;

    Game(int price) {
        this.price = price;
    }

    synchronized void buy(Buyer c) {
        if (!isBought) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            isBought = true;
            System.out.println("Buyer number: " + c.id + ", game price: " + this.price);
        }
    }
}
