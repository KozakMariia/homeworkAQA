package AQA.MobileConnection;

public class Family extends ConnectionInfo{

    public Family(int clientCount, double price) {
        super.clientCount = clientCount;
        super.price = price;
    }

    @Override
    public String tariff() {
        return "Family";
    }
}
