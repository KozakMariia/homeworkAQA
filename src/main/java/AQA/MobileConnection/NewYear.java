package AQA.MobileConnection;

public class NewYear extends ConnectionInfo{

    public NewYear(int clientCount, double price) {
        super.clientCount = clientCount;
        super.price = price;
    }

    @Override
    public String tariff() {
        return "NewYear";
    }
}
