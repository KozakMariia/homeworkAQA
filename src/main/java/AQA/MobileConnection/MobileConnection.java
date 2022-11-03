package AQA.MobileConnection;

public class MobileConnection {

    public static void main (String arg[]) {

        NewYear newYear = new NewYear(123, 14.99);
        Classic classic = new Classic(59, 4.99);
        Family family = new Family(34, 16.17);
        Halloween halloween = new Halloween(123, 22.31);

        Tariff tariff = new Tariff(newYear, classic, family, halloween);

        System.out.println(tariff.tariffName());
        System.out.println(tariff.tariffRange(15, 20));
        System.out.println(tariff.tariffSorted());
        System.out.println(tariff.clientSum());
    }

}
