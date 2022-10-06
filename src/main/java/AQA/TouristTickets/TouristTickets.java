package AQA.TouristTickets;
/*Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т д) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок.

 */
public class TouristTickets {

    public static void main(String arg[]) {

        Vacation vacation = new Vacation("bus" , 3, 7);
        Excursions excursions = new Excursions("train" , 2, 3);
        Treatment treatment = new Treatment("bike" , 1, 5);
        Shopping shopping = new Shopping("skate" , 2, 2);
        Cruise cruise = new Cruise("boat" , 3, 10);

        Proposal proposal = new Proposal(vacation, excursions, treatment, shopping, cruise);

        System.out.println(proposal.collectionTickets());
        System.out.println(proposal.sortedTickets());

    }

}