package AQA.TouristTickets;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Proposal {

    public List<Ticket> tickets;

    public Proposal(Ticket... ticketInfo) {
        this.tickets = List.of(ticketInfo);
    }

    public List<String> collectionTickets() {
        return tickets.stream()
                .map(el -> el.getTicketName())
                .collect(Collectors.toList());
    }

    public List<String> getSortedTicketsByDay() {
        return tickets.stream()
                .sorted(Comparator.comparingInt(Ticket::getDay))
                .map(el -> el.getTicketName())
                .collect(Collectors.toList());
    }

    public List<String> getSortedTicketsByEat() {
        return tickets.stream()
                .sorted(Comparator.comparingInt(Ticket::getEatCount))
                .map(el -> el.getTicketName())
                .collect(Collectors.toList());
    }

    public List<Ticket> getFilterByVehicle(String nameVehicle) {
        return tickets.stream()
                .filter(el -> el.getVehicle().equals(nameVehicle))
                .collect(Collectors.toList());
    }

}
