package AQA.TouristTickets;

public class Excursions extends TicketInfo{

    public Excursions(String vehicle, int eatCount, int day) {
        super.vehicle = vehicle;
        super.eatCount = eatCount;
        super.day = day;
    }

    @Override
    public String ticketName() {
        return "Excursions";
    }

}