package AQA.TouristTickets;

/*Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т д) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок.

 */
public class TouristTickets {

    public static void main(String arg[]) {

        Ticket vacation = new Ticket("bus", 3, 7, "vacation");
        Ticket excursions = new Ticket("train", 2, 3, "excursions");
        Ticket treatment = new Ticket("bike", 1, 5, "treatment");
        Ticket treatment1 = new Ticket("train", 1, 5, "treatment1");
        Ticket shopping = new Ticket("skate", 2, 2, "shopping");
        Ticket shopping1 = new Ticket("boat", 2, 2, "shopping1");
        Ticket cruise = new Ticket("boat", 3, 10, "cruise");

        Proposal proposal = new Proposal(vacation, excursions, treatment, treatment1, shopping, shopping1, cruise);

        System.out.println(proposal.collectionTickets());
        System.out.println(proposal.getSortedTicketsByDay());
        System.out.println(proposal.getFilterByVehicle("boat"));
    }

}
