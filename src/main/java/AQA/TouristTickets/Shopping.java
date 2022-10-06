package AQA.TouristTickets;

public class Shopping extends TicketInfo{

    public Shopping(String vehicle, int eatCount, int day) {
        super.vehicle = vehicle;
        super.eatCount = eatCount;
        super.day = day;
    }

    @Override
    public String ticketName() {
        return "Shopping";
    }

}
