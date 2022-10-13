package AQA.MobileConnection;

public class Classic extends ConnectionInfo{

    public Classic(int clientCount, double price) {
        super.clientCount = clientCount;
        super.price = price;
    }

    @Override
    public String tariff() {
        return "Classic";
    }
}
