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
        List<String> tariffName = connectionInfo.stream()
                .map(el -> el.tariff())
                .collect(Collectors.toList());
        return tariffName;
    }

    public int clientSum() {
        return connectionInfo.stream()
                .mapToInt(el -> el.getClientCount())
                .sum();
    }

    public List<String> tariffSorted() {
        List<String> tariffs = connectionInfo.stream()
                .sorted(Comparator.comparingDouble(ConnectionInfo::getPrice))
                .map(el -> el.tariff())
                .collect(Collectors.toList());
        return tariffs;
    }

    public List<String> tariffD() {
        List<String> tariffD = connectionInfo.stream()
                .filter(el -> el.getPrice() > 15 && el.getPrice() < 20)
                .map(el -> el.tariff())
                .collect(Collectors.toList());
        return tariffD;
    }

}
