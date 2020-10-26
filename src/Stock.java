public class Stock {
    private int shares; // number of shares owned after each transaction
    private double price; // latest current price
    private double capital; // capital = share cap owned (price * shares)

    public void buy (double p, int s) {
        shares += s;
        price = p;
        capital += s * p;
    }

    public void sell (double p, int s) {
        shares -= s;
        price = p;
        capital -= s * p;
    }

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public double getAveragePrice() {
        return capital / getShares();
    }
}
