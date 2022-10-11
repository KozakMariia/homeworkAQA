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
        return ticketInfo.stream()
                .map(el -> el.ticketName())
                .collect(Collectors.toList());
    }

    public List<String> getSortedTicketsByDay() {
        return ticketInfo.stream()
                .sorted(Comparator.comparingInt(TicketInfo::getDay))
                .map(el -> el.ticketName())
                .collect(Collectors.toList());
    }

    public List<String> getSortedTicketsByEat() {
        return ticketInfo.stream()
                .sorted(Comparator.comparingInt(TicketInfo::getEatCount))
                .map(el -> el.ticketName())
                .collect(Collectors.toList());
    }

    public List<String> getFilterByVehicle(String nameVehicle) {
        return ticketInfo.stream()
                .filter(el->el.getVehicle().equals(nameVehicle))
                .map(el->el.getVehicle()) //вивести всю інфу про відфільтровані обєкти
                .collect(Collectors.toList());
    }

}
