package AQA.MobileConnection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 Мобильная связь. Определить иерархию тарифов мобильной компании.
 Создать список тарифов компании.
 Посчитать общую численность клиентов.
 Провести сортировку тарифов на основе одного из параметров.
 Найти тариф в компании, соответствующий заданному диапазону параметров.

 */
public class Tariff {

    public List<ConnectionInfo> connectionInfo;

    public Tariff(ConnectionInfo... connectionInfo) {
        this.connectionInfo = List.of(connectionInfo);
    }

    public List<String> tariffName() {
        return connectionInfo.stream()
                .map(el -> el.tariff())
                .collect(Collectors.toList());
    }

    public int clientSum() {
        return connectionInfo.stream()
                .mapToInt(el -> el.getClientCount())
                .sum();
    }

    public List<String> tariffSorted() {
        return connectionInfo.stream()
                .sorted(Comparator.comparingDouble(ConnectionInfo::getPrice))
                .map(el -> el.tariff())
                .collect(Collectors.toList());
    }

    public List<String> tariffRange(int firstRangeValue, int lastRangeValue) {
        return connectionInfo.stream()
                .filter(el -> el.getPrice() > firstRangeValue && el.getPrice() < lastRangeValue)
                .map(el -> el.tariff())
                .collect(Collectors.toList());
    }

    public List<String> tariffRange(String name) {
        return connectionInfo.stream()
                .filter(el -> el.tariff().startsWith(name))
                .map(el->el.tariff())
                .collect(Collectors.toList());
    }

}
