package AQA.TouristTickets;

public class Vacation extends TicketInfo{

    public Vacation(String vehicle, int eatCount, int day) {
        super.vehicle = vehicle;
        super.eatCount = eatCount;
        super.day = day;
    }

    @Override
    public String ticketName() {
        return "Vacation";
    }

}