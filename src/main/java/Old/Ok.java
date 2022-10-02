package Old;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ok {

    public static void main(String... args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(4, "Ann"));
        persons.add(new Person(6, "Joe"));
        persons.add(new Person(8, "Jane"));
        persons.add(new Person(39, "Jack"));
        persons.add(new Person(41, "Mike"));
//        persons.stream()
//                .filter(el -> el.getName().contains("A"))
//                .collect(Collectors.toList());
//
//        persons.stream()
//                .map(el -> el.getName())
//                .findFirst();

        List<String> list = persons.stream()
                .map(el -> el.getName())
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
