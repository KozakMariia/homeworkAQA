package AQA.MobileConnection;

public class Halloween extends ConnectionInfo{

    public Halloween(int clientCount, double price) {
        super.clientCount = clientCount;
        super.price = price;
    }

    @Override
    public String tariff() {
        return "Halloween";
    }

}
