package RaundTwo;

/*
Створити класс Dog з параметри колір, вік та порода
Створити притулок для собак та передати до нього мінімум 6 песиків
 - повернути кількість собак у притулку певного кольору
 - вивести список порід
 - відсортувати список песиків за віком
 - повернути список песиків з повною інформацією про них відповідно до віку, що цікавить
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shelter {

    private static String selectedColor;
    private static int age;

    public List<Dog> dogs = new ArrayList<>();

    {
        dogs.add(new Dog("black", 2, "Lablador"));
        dogs.add(new Dog("brown", 1, "ppp"));
        dogs.add(new Dog("white", 5, "Dobermann"));
        dogs.add(new Dog("yellow", 6, "mmmmm"));
        dogs.add(new Dog("black", 2, "tttt"));
        dogs.add(new Dog("Grey", 2, "Wolf"));
    }

    public int getDogColorCount(String selectedColor) {
        return (int) dogs.stream()
                .filter(el -> el.getColor().equals(selectedColor))
                .count();
    }

    public Set<String> getPorodu() {
        return dogs.stream().map(el -> el.getPoroda())
                .collect(Collectors.toSet());
    }

    public List<Dog> getSortedDogByAge() {
        return dogs.stream().sorted(Comparator.comparingLong(Dog::getAge))
                .collect(Collectors.toList());
    }

    public List<Dog> getAllInfoDogs(int age) {
        return dogs.stream()
                .filter(el -> el.getAge() == age)
                .collect(Collectors.toList());
    }

}
