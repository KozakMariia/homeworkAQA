package AQA.TouristTickets;

public class Cruise extends TicketInfo {

    public Cruise(String vehicle, int eatCount, int day) {
        super.vehicle = vehicle;
        super.eatCount = eatCount;
        super.day = day;
    }

    @Override
    public String ticketName() {
        return "Cruise";
    }

}
