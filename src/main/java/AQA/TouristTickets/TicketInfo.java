package AQA.TouristTickets;

public abstract class TicketInfo {

    protected String vehicle;
    protected int eatCount;
    protected int day;

    public String getVehicle() {
        return vehicle;
    }

    public int getEatCount() {
        return eatCount;
    }

    public int getDay() {
        return day;
    }

    public abstract String ticketName();

}
