package AQA.TouristTickets;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Proposal {

    public List<TicketInfo> ticketInfo;

    public Proposal(TicketInfo... ticketInfo) {
        this.ticketInfo = List.of(ticketInfo);
    }

    public List<String> collectionTickets() {
        List<String> collectionTickets = ticketInfo.stream()
                .map(el -> el.ticketName())
                .collect(Collectors.toList());
        return collectionTickets;
    }

    public List<String> sortedTickets() {
        List<String> sortedTickets = ticketInfo.stream()
                .sorted(Comparator.comparingInt(TicketInfo::getDay))
                .map(el -> el.ticketName())
                .collect(Collectors.toList());
        return sortedTickets;
    }

}
