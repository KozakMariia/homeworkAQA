package AQA.TouristTickets;

public class Treatment extends TicketInfo{

    public Treatment(String vehicle, int eatCount, int day) {
        super.vehicle = vehicle;
        super.eatCount = eatCount;
        super.day = day;
    }

    @Override
    public String ticketName() {
        return "Treatment";
    }

}
