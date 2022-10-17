package AQA.TouristTickets;

public class Ticket {

    private final String vehicle;
    private final int eatCount;
    private final int day;
    private final String ticketName;

    public String getVehicle() {
        return vehicle;
    }

    public int getEatCount() {
        return eatCount;
    }

    public int getDay() {
        return day;
    }

    public String getTicketName() {
        return ticketName;
    }

    public Ticket(String vehicle, int eatCount, int day, String ticketName) {
        this.vehicle = vehicle;
        this.eatCount = eatCount;
        this.day = day;
        this.ticketName = ticketName;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicle='" + vehicle + '\'' +
                ", eatCount=" + eatCount +
                ", day=" + day +
                ", ticketName='" + ticketName + '\'' +
                '}';
    }

}
