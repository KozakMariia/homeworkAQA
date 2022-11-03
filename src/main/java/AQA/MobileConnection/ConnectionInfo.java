package AQA.MobileConnection;

public abstract class ConnectionInfo {

    protected int clientCount;
    protected double price;

    public int getClientCount() {
        return clientCount;
    }

    public double getPrice() {
        return price;
    }

    public abstract String tariff();

}
